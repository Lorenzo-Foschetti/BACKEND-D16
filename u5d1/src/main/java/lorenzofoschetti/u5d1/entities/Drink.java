package lorenzofoschetti.u5d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Drink {

    private String name;
    private Double price;
    private int calories;

    public Drink(String name, Double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", calories=" + calories +
                '}';
    }
}
