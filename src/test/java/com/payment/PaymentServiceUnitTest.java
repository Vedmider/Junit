package com.payment;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentServiceUnitTest {
    private PaymentService paymentService;

    @Before
    public void setUp(){
        paymentService = new PaymentService();
    }

    @Test
    public void shouldReturnNotNullInstance(){
        assertNotNull(paymentService.getPaymentResult());
    }

    @Test
    public void shouldReturnPaymentServiceInstance(){
        assertThat(paymentService.getPaymentResult(), CoreMatchers.instanceOf(PaymentResult.class));
    }

    @Test
    public void shouldReturnSuccessOrFailureInstanceOfEnum(){
        PaymentResult result = paymentService.getPaymentResult();
        assertTrue( result == PaymentResult.FAILURE || result == PaymentResult.SUCCESS);
    }

    @Test
    public void shouldReturnSuccessOrFailureStringNameOfEnum(){
        String paymentResultName = paymentService.getPaymentResult().name();

        assertTrue(paymentResultName.equals(PaymentResult.FAILURE.name()) ||
                paymentResultName.equals(PaymentResult.SUCCESS.name()));
    }

}
