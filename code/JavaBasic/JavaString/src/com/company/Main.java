package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        long a=new Date().getTime();
        String cc="";
        int n=10000;
        for (int i = 0; i < n; i++) {
            cc+="."+i;
        }
        System.out.println("String的时间"+(System.currentTimeMillis()-a)/1000.0+"s");
        long s1=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("."+i);
        }
        System.out.println("StringBuilder的时间"+(System.currentTimeMillis()-s1)/1000.0+"s");
        long s2=System.currentTimeMillis();
        StringBuffer sbf=new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("."+i);
        }
        System.out.println("StringBuffer的时间"+(System.currentTimeMillis()-s2)/1000.0+"s");




        //创建StringBuffer对象
        StringBuffer sb2 = new StringBuffer();
        //因为append()返回缓冲区本身
        sb2.append("程序职场").append(false); //链式编程
        //sb.reverse();
        //String s = new String(sb);//反转并转成String类型,不简洁
        //反转并转成String类型
        System.out.println(sb2.reverse().toString());

        StringBuilder sb3 = new StringBuilder();
        sb3.append("公众号：程序职场");
//        sb3.setLength(1);//缓冲区设置为1
        System.out.println(sb2.reverse().toString());

    }
}
