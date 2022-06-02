package com.moshkova.task2;

import com.moshkova.task2.model.Pseudonym;
import com.moshkova.task2.repository.PseudonymRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class Application implements ApplicationRunner {
    private final PseudonymRepository pseudonymRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args){
        pseudonymRepository.save(new Pseudonym("https://localhosts.mobi/8080", "/I/pushLocal", 0));
        pseudonymRepository.save(new Pseudonym("https://localhosts/8080", "/I/pushLoca", 0));
        System.out.println(pseudonymRepository.findAll());
    }
}
