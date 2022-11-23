package com.refactorizando.grpc.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@SpringBootApplication
@EnableScheduling
public class SpringBootGrpcClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGrpcClientApplication.class, args);

    }
}
