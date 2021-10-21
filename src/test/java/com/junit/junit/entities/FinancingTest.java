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
            financing.setMonths(20);
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
            Financing financing = new Financing(100000.0, 2000.0, 80);
            financing.setTotalAmount(2000000.0);
        });
    }

    // valid setIncome
    @Test
    public void setIncomeShouldUpdateValueWhenValidData() {

        // arrange
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // action
        financing.setIncome(3000.0);

        // assertion
        Assertions.assertEquals(3000.0, financing.getIncome());
    }

    // exception setIncome
    @Test
    public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {

        // arrange
        // action
        // assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);
            financing.setIncome(500.0);
        });
    }

    // valid month
    @Test
    public void setMonthsShouldUpdateValueWhenValidData() {

        // arrange
        Financing financing = new Financing(100000.0, 2000.0, 80);
        
        // action
        financing.setMonths(90);
        
        // assert
        Assertions.assertEquals(90, financing.getMonths());
    }

    // exception month
    @Test
    public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {

        // arrange
        // action
        // assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);
            financing.setMonths(70);
        });
    }

    // entry
    @Test
    public void entryShouldCalculateEntryCorrectly() {

        Financing financing = new Financing(100000.0, 2000.0, 80);
        Assertions.assertEquals(20000.0, financing.entry());
    }

    // quota
    @Test
    public void quotaShouldCalculateEntryCorrectly() {

        Financing financing = new Financing(100000.0, 2000.0, 80);
        Assertions.assertEquals(1000.0, financing.quota());
    }
}
