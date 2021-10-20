package com.junit.junit.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FinancingTest {

    // valid constructor
    @Test
    public void constructorShouldCreateObjectWhenValidData() {

        // arrange
        // action
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // assert
        Assertions.assertEquals(100000.0, financing.getTotalAmount());
        Assertions.assertEquals(2000.0, financing.getIncome());
        Assertions.assertEquals(80, financing.getMonths());
    }

    // exception constructor
    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {

        // arrange
        // action

        // assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 20);
        });
    }

    // valid setTotalAmount
    @Test
    public void setTotalAmountShouldUpdateValueWhenValidData() {

        // arrange
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // action
        financing.setTotalAmount(50000.0);

        // assert
        Assertions.assertEquals(50000.0, financing.getTotalAmount());
    }

    // exception setTotalAmount
    @Test
    public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {

        // arrange
        // action
        // assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(1000000.0, 2000.0, 80);
            financing.setTotalAmount(2000000.0);
        });
    }
}
