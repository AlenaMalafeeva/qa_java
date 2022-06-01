package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    private Cat cat;

    @Mock
    private Feline feline;

    @Before
    public void setup() {
        cat = new Cat(feline);
    }

    @Test
    public void getFoodShouldReturnList() throws Exception {
        List<String> food = List.of("Рыба", "Птица");
        when(feline.eatMeat()).thenReturn(food);

        List<String> actualFood = cat.getFood();
        Assert.assertEquals(food, actualFood);
    }

    @Test
    public void shouldGetCorrectSound() {
        String expected = "Мяу";
        String actual = cat.getSound();
        Assert.assertEquals(expected, actual);
    }
}
