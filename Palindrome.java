import java.io.*;
import java.util.*;
class Palindrome{
    public static void main(String[] args) {
    String rev,st;
    System.out.println("Enter the string you want to check as Palindrome or not");
    Scanner Sc=new Scanner(System.in);
    st=Sc.nextString();
     StringBuffer s=new StringBuffer(st);
     s.reverse();
     System.out.println(s);
}
}