package cat.itacademy.s04.t02.n03.S04T02N03.exceptions;

public class FruitNotFoundException extends RuntimeException {
    public FruitNotFoundException(String id) {
        super("Could not find fruit with id: " + id);
    }
}
