package com.example;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import java.util.List;
import static org.mockito.Mockito.when;

public class LionFoodAndKittensTest {
    private Lion lion;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private Feline feline;

    @Test
    public void getFoodShouldReturnList() throws Exception {
        lion = new Lion(feline);
        List<String> food = List.of("Рыба", "Птица");
        when(feline.getFood("Хищник")).thenReturn(food);

        List<String> actualFood = lion.getFood();
        Assert.assertEquals(food, actualFood);
    }

    @Test
    public void getKittensShouldReturnNumber() {
        lion = new Lion(feline);
        when(feline.getKittens()).thenReturn(5);
        int expected = 5;
        int actual = lion.getKittens();
        Assert.assertEquals(expected, actual);
    }
}
