package com.xiaolu.item66_sync_mutable_data;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class StopThreadTest {
    private static boolean stopRequested;
    private static synchronized void requestStop() {
        stopRequested = true;
    }
    private static synchronized boolean stopRequested() {
        return stopRequested;
    }

    @Test
    public void syncTest1() throws Exception {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopRequested()) {
                    i++;
                    System.out.println(i);
                }
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }
}
