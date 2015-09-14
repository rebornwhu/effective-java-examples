package com.xiaolu.item27_generic_methods;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SomeMethodsTest {

    @Test
    public void unionTest() throws Exception {
        Set<String> guys = new HashSet<String>(
                Arrays.asList("Tom", "Dick", "Harry"));
        Set<String> stooges = new HashSet<String>(
                Arrays.asList("Larry", "Moe", "Curly"));
        Set<String> aflCio = SomeMethods.union(guys, stooges);
        System.out.println(aflCio);
    }

    @Test
    public void unionTest2() {
        Set<Integer> integers = new HashSet<Integer>(Arrays.asList(1, 2, 3));
        Set<Double> doubles = new HashSet<Double>(Arrays.asList(1.1, 2.2, 3.3));
        Set<Number> numbers = SomeMethods.<Number> union(integers, doubles);
        System.out.println(numbers);
    }

    @Test
    public void identityFunctionTest() throws Exception {
        String[] strings = { "jute", "hemp", "nylon" };
        SomeMethods.UnaryFunction<String> sameString = SomeMethods.identityFunction();
        for (String s : strings)
            System.out.println(sameString.apply(s));

        Number[] numbers = { 1, 2.0, 3L };
        SomeMethods.UnaryFunction<Number> sameNumber = SomeMethods.identityFunction();
        for (Number n : numbers)
            System.out.println(sameNumber.apply(n));
    }
}