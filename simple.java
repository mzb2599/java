/*
 * Project: Add function in java
 * Filename: c:\Users\MOHD ZAKI\helloworld\simple.java
 * Path: c:\Users\MOHD ZAKI\helloworld
 * Created Date: Saturday, June 19th 2021, 7:06:24 pm
 * Author: Mohammed Zaki
 * 
 * Copyright (c) 2021 Your Company
 */

class simple {
    
    int g=10;

    int x=5;
    int y=7;

    public static int add(int a, int b){
        int c;
        c=a+b;
        return c;
    }

    public static void main(String[] args) {
        //Accessing non-static variables is done by call through an object in Java
        simple s = new simple();
        int z=add(s.x,s.y);
        System.out.println("z="+z);
    }
}