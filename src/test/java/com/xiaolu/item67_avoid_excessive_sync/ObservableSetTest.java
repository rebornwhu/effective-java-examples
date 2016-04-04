package com.xiaolu.item67_avoid_excessive_sync;

import org.junit.Test;

import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ObservableSetTest {

    @Test
    public void someTest1() throws Exception {
        ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());
        set.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(ObservableSet<Integer> s, Integer e) {
                System.out.println(e);
                if (e == 23)
                    s.removeObserver(this);
            }
        });

        for (int i = 0; i < 100; i++) {
            set.add(i);
        }
    }

    @Test
    public void executorServiceTest() throws Exception {
        ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());
        set.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(final ObservableSet<Integer> s, Integer e) {
                System.out.println(e);
                if (e == 23) {
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    final SetObserver<Integer> observer = this;
                    try {
                        executor.submit(new Runnable() {
                            @Override
                            public void run() {
                                s.removeObserver(observer);
                            }
                        }).get();
                    } catch (ExecutionException | InterruptedException ex) {
                        throw new AssertionError(ex.getCause());
                    } finally {
                        executor.shutdown();
                    }
                }
            }
        });
    }
}
