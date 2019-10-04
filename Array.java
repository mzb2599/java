import java.util.*;
import java.io.*;
class Array
{
    public static void main(String[] args) {
        float sum=0;
        int i;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=Sc.nextInt();
        int a[]=new int[n];
        for ( i = 0; i < n; i++) {
            System.out.println("Enter element "+i+":");
            a[i]=Sc.nextInt();  
            sum=sum+a[i];          
        }
        float avg=sum/n;
        System.out.println("Average of array elements is "+avg);
    }
}