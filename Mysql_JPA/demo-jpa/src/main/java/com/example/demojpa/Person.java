package com.example.demo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Table(name = "persons")
@Data
@RequiredArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "firstName")
    private String firstName;
    private String lastName;

    public Person(Person person) {
        this.id = person.id;
        this.firstName = person.firstName;
        this.lastName = person.lastName;
    }

    public static Person GetNewOrder() {
        Person p = new Person();
        p.id = 1L;
        p.firstName = "Q";
        p.lastName = "L";
        return p;
    }
}
