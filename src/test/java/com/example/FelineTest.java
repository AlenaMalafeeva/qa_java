package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    private Feline feline;

    @Before
    public void setup() {
        feline = new Feline();
    }

    @Test
    public void eatMeatShouldReturnCorrectFood() throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        Assert.assertEquals(food, actualFood);
    }

    @Test
    public void getKittensWithParam() {
        int expected = 3;
        int actual = feline.getKittens(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithoutParam() {
        int expected = 1;
        int actual = feline.getKittens();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFamilyShouldReturnFeline() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        Assert.assertEquals(expected, actual);
    }
}