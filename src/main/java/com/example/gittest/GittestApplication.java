package com.example.gittest;

import com.example.gittest.Controller.B;
import com.example.gittest.Controller.JavaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GittestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GittestApplication.class, args);

        B.test();
        JavaController.s();
        System.out.println("修改一下");
        System.out.println("再修改一下");
    }

}
