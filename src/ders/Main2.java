package ders;

import ders.thread.MyRunnable;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class Main2 {

    public static void main(String[] args) throws IOException, InterruptedException {

        MyRunnable runnable1 = new MyRunnable("SALAM ", "file/file3.txt", 100);
        MyRunnable runnable2 = new MyRunnable("Sag ol ","file/file3.txt",100);
        ExecutorService executorService = newFixedThreadPool(2);
        executorService.submit(runnable1);
        executorService.submit(runnable2);
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
    }
}
