package org.utopia.treasure.swagger;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwaggerApplication {


    public static void main(String[] args) {
        new SpringApplication(SwaggerApplication.class).run(args);
    }

}
