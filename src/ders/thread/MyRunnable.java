package ders.thread;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MyRunnable implements Runnable {

    private String message;
    private String path;
    private int count;

    public MyRunnable(String message, String path, int count) {
        this.message = message;
        this.path = path;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < count; i++) {
                String messageBox = message + System.nanoTime() + "\n";
                Files.write(Paths.get(path),
                        messageBox.getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.APPEND,
                        StandardOpenOption.CREATE);
            }
            System.out.println("Successfully wrote to the file: " + message);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
