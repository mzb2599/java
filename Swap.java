import java.util.*;
class Swap{
    public static void main(String[] args) {
        int a,b,t;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a no");
        a=Sc.nextInt();
        Scanner Sci=new Scanner(System.in);
        System.out.println("Enter another no");
        b=Sci.nextInt();
        System.out.println("Before swap a="+a +"b="+b);
        t=a;
        a=b;
        b=t;
        System.out.println("After swap a="+a +"b="+b);

    }
}