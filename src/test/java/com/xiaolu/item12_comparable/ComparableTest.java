package com.xiaolu.item12_comparable;

import org.junit.Test;

import java.math.BigDecimal;

public class ComparableTest {

    @Test
    public void BigDecimalTest() throws Exception {
        BigDecimal num1 = new BigDecimal("1.0");
        BigDecimal num2 = new BigDecimal("1.00");
        System.out.println(num1.compareTo(num2));
        System.out.println(num1.equals(num2));
    }
}
