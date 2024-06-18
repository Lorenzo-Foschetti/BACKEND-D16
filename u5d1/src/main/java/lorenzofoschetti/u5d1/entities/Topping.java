package lorenzofoschetti.u5d1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Topping {

    private String name;
    private Double price;
    private int calories;

    public Topping(String name, Double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", calories=" + calories +
                '}';
    }
}
