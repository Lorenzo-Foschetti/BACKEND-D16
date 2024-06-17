package lorenzofoschetti.u5d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Pizza {


    List<Topping> toppings;
    private String name;
    private double price;
    private int calories;

    public Pizza(List<Topping> toppings, double price, String name, int calories) {
        this.toppings = toppings;
        this.price = price;
        this.name = name;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings=" + toppings +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", calories=" + calories +
                '}';
    }
}
