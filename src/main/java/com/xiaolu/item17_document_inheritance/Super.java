package com.xiaolu.item17_document_inheritance;

public class Super {
    public Super() {
        overrideMe();
        ignoredMethod();
    }

    public void overrideMe() {}

    private void ignoredMethod() {
        System.out.println("private method defined in super class");
    }
}