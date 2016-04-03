package com.xiaolu.item35_annotation;

public class Sample {

    @MyTest
    public static void m1() {
    }

    public static void m2() {
    }

    @MyTest
    public static void m3() {
        throw new RuntimeException("Boom");
    }

    public static void m4() {
    }

    @MyTest
    public void m5() {
    }

    @MyTest
    public static void m7() {
        throw new RuntimeException("Crash");
    }

    public static void m8() {
    }
}
