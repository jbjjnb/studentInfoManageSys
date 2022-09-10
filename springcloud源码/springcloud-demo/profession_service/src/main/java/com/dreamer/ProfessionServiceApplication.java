package com.dreamer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/dreamer/mapper")
public class ProfessionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProfessionServiceApplication.class, args);
    }

}
