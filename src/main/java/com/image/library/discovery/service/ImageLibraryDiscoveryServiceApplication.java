package com.image.library.discovery.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ImageLibraryDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImageLibraryDiscoveryServiceApplication.class, args);
    }

}
