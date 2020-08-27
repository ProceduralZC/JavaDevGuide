package com.company;

public class ThreadWait {
    public static void main(String[] args) {
        /**
         * 作者：公众号：程序职场
         * 代码描述：创建两个线程一个操作年龄的信息，一个是工作量的信息
         */
        //输出年龄信息
        Object obj=new Object();
        Thread download=new Thread(){
            public void run() {
            System.out.println("开始输出年龄");
            for (int i = 1; i < 6; i+=1) {
                System.out.println("年龄="+i);
            }
            System.out.println("年龄输出成功");
            synchronized (obj) {
                System.out.println("唤起");
                obj.notify();//唤起wait的等待
            }
            System.out.println("开始输出工作量");
            for (int i = 1; i < 6; i+=1) {
                System.out.println("工作量="+i+"小时");
            }
            System.out.println("工作量输出成功");
            }
        };

        //2.年龄输出成果的结果
        Thread show=new Thread(){
            public void run(){
            synchronized (obj) {
                try {
                    System.out.println("阻塞");
                    obj.wait();//阻塞当前
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("年龄完成");
            }
            }
        };

        download.start();
        show.start();
    }
}
