package fatfaggy.animals;

import fatfaggy.animals.configs.MyConfig;
import fatfaggy.animals.entities.Cat;
import fatfaggy.animals.entities.Dog;
import fatfaggy.animals.entities.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("dog");
        Parrot parrot = context.getBean("parrot - kesha", Parrot.class);

        System.out.println(cat.getName());
    }
}
