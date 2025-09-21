package cat.itacademy.s04.t02.n03.S04T02N03.controllers;

import cat.itacademy.s04.t02.n03.S04T02N03.models.Fruit;
import cat.itacademy.s04.t02.n03.S04T02N03.models.FruitDTO;
import cat.itacademy.s04.t02.n03.S04T02N03.services.FruitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruits")
public class FruitController {

    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping
    public ResponseEntity<Fruit> createFruit(@RequestBody FruitDTO fruitDto) {
        Fruit newFruit = fruitService.createFruit(fruitDto);
        return new ResponseEntity<>(newFruit, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Fruit>> getAllFruits() {
        List<Fruit> fruits = fruitService.getAllFruits();
        return new ResponseEntity<>(fruits, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fruit> getFruitById(@PathVariable String id) {
        Fruit fruit = fruitService.getFruitById(id);
        return new ResponseEntity<>(fruit, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fruit> updateFruit(@PathVariable String id, @RequestBody FruitDTO fruitDto) {
        Fruit updatedFruit = fruitService.updateFruit(id, fruitDto);
        return new ResponseEntity<>(updatedFruit, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFruit(@PathVariable String id) {
        fruitService.deleteFruit(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
