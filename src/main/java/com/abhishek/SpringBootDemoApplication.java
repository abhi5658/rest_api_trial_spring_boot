package com.abhishek;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
 
@SpringBootApplication
@EnableJpaAuditing
public class SpringBootDemoApplication {
 
    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringBootDemoApplication.class, args);
        
//        openHomePage();	//calling browser opening code
    }
    
    /*
     * Code to open bowser automatically
     */
//    private static void openHomePage() throws IOException {
//        Runtime rt = Runtime.getRuntime();
//        rt.exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:8080/api");
//     }
}