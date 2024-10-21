package com.example.notes.text;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextConfig {
    @Bean
    CommandLineRunner commandLineRunner(TextRepository repository) {
        return args -> {
        Text task1 =new Text (
                "Hello Everyone , This is my first spring boot application."
        );
        Text task2=new Text (
                "Hello Everyone , This is my first spring boot application."
        );
        repository.saveAll(
                List.of(task1,task2)
        );
        };
    }
}
