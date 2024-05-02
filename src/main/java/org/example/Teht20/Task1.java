package org.example.Teht20;

public class Task1 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Task1 iteration " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
