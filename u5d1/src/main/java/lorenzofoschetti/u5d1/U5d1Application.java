package lorenzofoschetti.u5d1;

import lorenzofoschetti.u5d1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5d1Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5d1Application.class);

        SpringApplication.run(U5d1Application.class, args);
        Menu menu = context.getBean(Menu.class);
        System.out.println(menu);
    }

}
