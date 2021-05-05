package javarush.week;

import fatfaggy.animals.configs.MyConfig;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("It's " + weekDay.getDay() + " today!");
    }
}
