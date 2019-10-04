import java.io.*;
import java.util.*;
class Input2{
    public static void main(String[] args){
        System.out.println("Enter three numbers");
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c =Integer.parseInt(args[2]);
        int max = 0;
        if((a>b)&&(a>c))
            max = a;
        else if(b>c)
        {
            max = b;
        }
        else
            max = c;
        System.out.println(max);
    }
}