package com.company;
import java.util.ArrayList;
import java.util.List;

/**
 * 类型通配符
 */
public class Java3 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("程序职场");
        age.add(30);
        number.add(10000);

        getData(name);
        getData(age);
        getData(number);
    }

    public static void getData(List<?> data) {
        System.out.println("DateInfo :" + data.get(0));
    }
}