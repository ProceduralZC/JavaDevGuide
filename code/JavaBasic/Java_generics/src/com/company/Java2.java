package com.company;

/**
 * 泛型类
 * @param <T>
 */
public class Java2<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Java2<Integer> integerBox = new Java2<Integer>();
        Java2<String> stringBox = new Java2<String>();

        integerBox.add(new Integer(10000));
        stringBox.add(new String("程序职场"));
        System.out.printf("值为 :%d\n\n", integerBox.get());
        System.out.printf("字符为 :%s\n", stringBox.get());
    }
}

