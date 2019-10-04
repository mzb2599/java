import java.util.*;
class Add
{
    int a,b;
    public Add(int x,int y) 
    {
    a=x;
    b=y;
    }
    int Addcomp()
    {
    int add;
    add=a+b;
    return add;    
    }   
}
class Complexadd{
    public static void main(String[] args) {
        int x1,x2,x3,x4,c,d;
        System.out.println("Enter real part of number 1");
        Scanner Sc=new Scanner(System.in);
        x1=Sc.nextInt();
        System.out.println("Enter imaginary part of number 1");
        x2=Sc.nextInt();
        System.out.println("Enter real part of number 2");
        x3=Sc.nextInt();
        System.out.println("Enter imaginary part of number 2");
        x4=Sc.nextInt();
        Add a=new Add(x1,x3);
        Add b=new Add(x2,x4); 
        System.out.println(a.Addcomp()+"+i"+b.Addcomp());           
 
    }
}