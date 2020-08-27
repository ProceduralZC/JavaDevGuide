package com.company;

public class Main {
    public final String  nameA = "程序职场"; //在定义时初始化
    public final String nameB;{nameB="程序职场";} //在初始化块中初始化
    public static final String nameC = "程序职场";//静态常量，在定义时初始化
    public static final String nameD;static{nameD = "程序职场";}//静态常量，在静态初始化块中初始化
    public final String nameE;//静态变量不能在初始化块中初始化,在函数中初始化
    public Main() {
        nameE = "程序职场";
    }

    public static void main(String[] args) {
        // write your code here
    }
}
