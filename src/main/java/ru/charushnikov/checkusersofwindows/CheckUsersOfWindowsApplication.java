package ru.charushnikov.checkusersofwindows;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class CheckUsersOfWindowsApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(CheckUsersOfWindowsApplication.class, args);
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler localhost:8080");
    }

}
