package com.payment;

import org.junit.Before;
import org.junit.Test;

public class PriceServiceUnitTest {
    private PriceService priceService;

    @Before
    public void setUp(){
        priceService = new PriceService();
    }

    @Test
    public void shouldNotThrowException(){
        priceService.validatePrice(10);
    }

    @Test(expected = IllegalAccessException.class)
    public void shouldThrowIllegalArgumentException(){
        priceService.validatePrice(-10);
    }
}
