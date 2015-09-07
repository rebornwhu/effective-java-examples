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
}
