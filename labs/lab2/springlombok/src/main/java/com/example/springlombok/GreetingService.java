package com.example.springlombok;
import org.springframework.stereotype.Service;


@Service
public class GreetingService {
    public String greet() {
        return "Hello, World";
    }
}