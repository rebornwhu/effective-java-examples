package com.xiaolu.item67_avoid_excessive_sync;

import org.junit.Test;

import java.util.HashSet;

public class ObservableSetTest {

    @Test
    public void someTest1() throws Exception {
        ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());
        set.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(ObservableSet<Integer> set, Integer element) {
                System.out.println(element);
            }
        });

        for (int i = 0; i < 100; i++) {
            set.add(i);
        }
    }
}
