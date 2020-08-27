package com.company;

/**
 * 简介：使用泛型方法打印不同字符串的元素
 */
class Java1
{
    // 泛型方法 printArray
    public static < E > void printArray( E[] inputArray )
    {
        // 输出数组元素
        for ( E element : inputArray ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

    public static void main( String args[] )
    {
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Double[] doubleArray = { 2.1, 2.2, 2.3, 2.4 };
        Character[] charArray = { '程', '序', '职', '场' };

        System.out.println( "整型数组元素为:" );
        printArray( intArray  ); // 传递一个整型数组
        System.out.println( "\n双精度型数组元素为:" );
        printArray( doubleArray ); // 传递一个双精度型数组
        System.out.println( "\n字符型数组元素为:" );
        printArray( charArray ); // 传递一个字符型数组
    }
}
