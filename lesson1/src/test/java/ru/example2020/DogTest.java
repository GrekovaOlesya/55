package ru.example2020;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {

    Dog dog = new Dog(3,"Archi",2);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getweight() {
        assertEquals(2,dog.getWeight());
    }
}