package javarush.week;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public interface WeekDay {
    @Bean
    String getDay();
}
