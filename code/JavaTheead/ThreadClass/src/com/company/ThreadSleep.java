package com.company;

public class ThreadSleep {
    public static void main(String[] args) {
        // write your code here
        int time = 10;

        for (int i=1;i<=time;i++) {
            try {
                Thread.sleep(1000);
                System.out.println("线程休眠时间=" + i +"秒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
