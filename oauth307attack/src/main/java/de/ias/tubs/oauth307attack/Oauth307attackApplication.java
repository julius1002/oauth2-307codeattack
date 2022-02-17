package de.ias.tubs.oauth307attack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

/*
Application to conduct HTTP 307 redirect attacks e.g. in OAuth 2.0 settings
 */
@SpringBootApplication
public class Oauth307attackApplication {
    public static void main(String[] args) {
        SpringApplication.run(Oauth307attackApplication.class);
    }
}
