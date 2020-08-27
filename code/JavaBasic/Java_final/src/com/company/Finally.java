package com.company;

public class Finally {
    public static void main(String[] args) {
//        try{
//            throw new NullPointerException();
//        }catch(NullPointerException e){
//            System.out.println("程序抛出了异常");
//        }finally{
//            //这里总会被执行，线程，数据库，数据流，文件流等结束处理一般写在这里，可以降低程序的出错几率
//            System.out.println("执行了finally语句块");
//        }


        try {
            System.out.println("return 程序职场");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("return 是否 执行了finally语句");
        }


        try {
            System.out.println("System.exit 程序职场");
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("System.exit情况下 是否 执行了finally语句");
        }


    }
}
