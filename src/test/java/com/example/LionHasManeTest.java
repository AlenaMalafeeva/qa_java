package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionHasManeTest {
    private final String sex;
    private final boolean expectedHasMane;

    public LionHasManeTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.expectedHasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
                {"Лев", false}
        };
    }

    @Test
    public void doesHaveMane() throws Exception {

        try {
            Lion lion = new Lion(sex);
            boolean actual = lion.doesHaveMane();
            Assert.assertEquals(expectedHasMane, actual);
        } catch (Exception exception) {
            String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
            Assert.assertEquals(expectedMessage, exception.getMessage());
        }
    }
}