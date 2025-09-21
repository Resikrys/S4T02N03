package cat.itacademy.s04.t02.n03.S04T02N03.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "fruits")
public class Fruit {

    @Id
    private String id;
    private String name;
    private int quantityKilos;

}
