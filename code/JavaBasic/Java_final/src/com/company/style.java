package com.company;

public class style {
    public class ParentClass{
        public final void TestFinal(){
            System.out.println("父类--这是一个final方法---程序职场");
        }
    }
    public class childClass extends ParentClass{
        public void main(String[]args){
            childClass sc = new childClass();
            sc.TestFinal();
        }
    }

    public static void main(String[] args) {

    }
}
