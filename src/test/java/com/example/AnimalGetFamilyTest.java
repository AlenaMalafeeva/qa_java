package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGetFamilyTest {

    @Test
    public void checkGetFamily() {
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        Assert.assertEquals(expected, actual);
    }
}