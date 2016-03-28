package com.xiaolu.item53_prefer_interface_to_reflection;

import java.util.Arrays;
import java.util.Set;

public class PowerfulReflection {

    public static void main(String[] args) {
        Class<?> c1 = null;

        try {
            c1 = Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found.");
            System.exit(1);
        }

        Set<String> s = null;
        try {
            s = (Set<String>) c1.newInstance();
        } catch (InstantiationException e) {
            System.err.println("Class not instantiated.");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.err.println("Class not accessible.");
            System.exit(1);
        }

        s.addAll(Arrays.asList(args).subList(1, args.length));
        System.out.println(s);
    }
}
