package com.company;

public final class TestClass {
    String nameA = "程序职场";
    final String nameB = "公众号";
    public static void main(String[] args){
        TestClass ft = new TestClass();
        ft.nameA = "公众号：程序职场"; /*final类TestClass的属性值 i是可以改变的，因为属性值i前面没final修饰*/
        System.out.println(ft.nameA);
    }
}
