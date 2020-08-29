package com.company;

public class ThreadSyn implements Runnable{
//    //有5张票
//    int ticked = 5;
//    @Override
//    //重写run()方法
//    public void run() {
//        for(int i=ticked;i>0;i--) {
//            System.out.println(Thread.currentThread().getName() + " sells " + i + " ticket");
//        }
//    }
//    //main方法测试
//    public static void main(String[] args) {
//        //实例化Thread对象
//        ThreadSyn tT = new ThreadSyn();
//        Thread td1 = new Thread(tT,"火车站");
//        Thread td2 = new Thread(tT,"老黄牛");
//        Thread td3 = new Thread(tT,"代理商");
//        Thread td4 = new Thread(tT,"12306");
//        //启动线程
//        td1.start();
//        td2.start();
//        td3.start();
//        td4.start();
//    }


    int ticket = 12;
    //担任"锁",锁是什么不重要,他只是一把锁
    //要求,非空对象
    private String mutex = "";
    @Override
    //重写run()方法
    public void run() {
        //while循环
        while (true) {
            synchronized (mutex) {
                if(ticket > 0) {
                    System.out.println(Thread.currentThread().getName()+ " sells " + ticket-- + " ticket.");
                }else {
                    break;
                }
            }
        }
    }
    //main方法测试
    public static void main(String[] args) {
        //实例化Thread对象
        ThreadSyn tT = new ThreadSyn();
        Thread td1 = new Thread(tT,"火车站");
        Thread td2 = new Thread(tT,"携程");
        Thread td3 = new Thread(tT,"代理商");
        Thread td4 = new Thread(tT,"12306");
        //启动线程
        td1.start();
        td2.start();
        td3.start();
        td4.start();
    }
}
