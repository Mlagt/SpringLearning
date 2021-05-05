package javarush.week;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Wednesday implements WeekDay{

    @Bean
    public String getDay() {
        return null;
    }
}
