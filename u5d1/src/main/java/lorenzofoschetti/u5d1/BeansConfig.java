package lorenzofoschetti.u5d1;


import lorenzofoschetti.u5d1.entities.Pizza;
import lorenzofoschetti.u5d1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class BeansConfig {


    @Bean
    public Topping pomodoro() {
        return new Topping("Pomodoro", 0.8, 200);
    }


    @Bean
    public Topping mozzarella() {
        return new Topping("Mozzarella", 1.2, 250);
    }

    @Bean
    public Pizza Margherita() {
        return new Pizza("Margherita", 6.50, 300, Arrays.asList(pomodoro(), mozzarella()));
    }


}
