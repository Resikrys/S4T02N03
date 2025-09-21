package cat.itacademy.s04.t02.n03.S04T02N03.events;

import cat.itacademy.s04.t02.n03.S04T02N03.models.Fruit;
import org.springframework.context.ApplicationEvent;

public class FruitQuantityChangedEvent extends ApplicationEvent {

    private final Fruit fruit;

    public FruitQuantityChangedEvent(Object source, Fruit fruit) {
        super(source);
        this.fruit = fruit;
    }

    public Fruit getFruit() {
        return fruit;
    }

}
