package lorenzofoschetti.u5d1;


import lorenzofoschetti.u5d1.entities.Drink;
import lorenzofoschetti.u5d1.entities.Pizza;
import lorenzofoschetti.u5d1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class BeansConfig {


    @Bean
    public Topping pomodoro() {
        return new Topping("Pomodoro", 0.8, 40);
    }


    @Bean
    public Topping mozzarella() {
        return new Topping("Mozzarella", 1.2, 80);
    }

    @Bean
    public Topping salamePiccante() {
        return new Topping("Salame Piccante", 1.1, 100);
    }

    @Bean
    public Pizza Margherita() {
        return new Pizza(Arrays.asList(pomodoro(), mozzarella()), 6.5, "Margherita", 300);
    }


    @Bean
    public Pizza Diavola() {
        return new Pizza(Arrays.asList(pomodoro(), mozzarella(), salamePiccante()), 7.5, "Diavola", 350);
    }

    @Bean
    public Drink Cocacola() {
        return new Drink("Cocacola", 1.8, 250);
    }
}


