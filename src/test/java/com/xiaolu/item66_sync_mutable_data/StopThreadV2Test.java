package com.xiaolu.item66_sync_mutable_data;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class StopThreadV2Test {

    private static volatile boolean stopRequested;

    @Test
    public void syncV2Test() throws Exception {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopRequested) {
                    i++;
                    System.out.println(i);
                }
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }

}
