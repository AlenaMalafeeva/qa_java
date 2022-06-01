package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalGetFoodTest {

    private final String animalKind;
    private final List<String> expectedFood;

    public AnimalGetFoodTest(String animalKind, List<String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][] {
                { "Травоядное", List.of("Трава", "Различные растения")},
                { "Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Всеядное", List.of("Неизвестный вид животного, используйте значение Травоядное или Хищник")}
        };
    }

    @Test
    public void checkGetFood() throws Exception {

        try {
            Animal animal = new Animal();
            List<String> actual = animal.getFood(animalKind);
            Assert.assertEquals(expectedFood, actual);
        } catch (Exception exception) {
            Assert.assertEquals(expectedFood.get(0), exception.getMessage());
        }
    }
}