package cat.itacademy.s04.t02.n03.S04T02N03.services;

import cat.itacademy.s04.t02.n03.S04T02N03.exceptions.FruitNotFoundException;
import cat.itacademy.s04.t02.n03.S04T02N03.models.Fruit;
import cat.itacademy.s04.t02.n03.S04T02N03.models.FruitDTO;
import cat.itacademy.s04.t02.n03.S04T02N03.repository.FruitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {

    private final FruitRepository fruitRepository;
    private final ApplicationEventPublisher eventPublisher;

    public FruitService(FruitRepository fruitRepository, ApplicationEventPublisher eventPublisher) {
        this.fruitRepository = fruitRepository;
        this.eventPublisher = eventPublisher;
    }

    public Fruit createFruit(FruitDTO fruitDto) {
        Fruit newFruit = new Fruit();
        newFruit.setName(fruitDto.getName());
        newFruit.setQuantityKilos(fruitDto.getQuantityKilos());
        return fruitRepository.save(newFruit);
    }

    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }

    public Fruit getFruitById(String id) {
        return fruitRepository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException(id));
    }

    public Fruit updateFruit(String id, FruitDTO fruitDto) {
        Fruit existingFruit = getFruitById(id);

        int oldQuantity = existingFruit.getQuantityKilos();
        int newQuantity = fruitDto.getQuantityKilos();

        existingFruit.setName(fruitDto.getName());
        existingFruit.setQuantityKilos(newQuantity);

        Fruit updatedFruit = fruitRepository.save(existingFruit);

        if (oldQuantity != newQuantity) {
            eventPublisher.publishEvent(new FruitQuantityChangedEvent(this, updatedFruit));
        }

        return updatedFruit;
    }

    public void deleteFruit(String id) {
        Fruit fruitToDelete = getFruitById(id);
        fruitRepository.delete(fruitToDelete);
        eventPublisher.publishEvent(new FruitDeletedEvent(this, fruitToDelete));
    }

}
