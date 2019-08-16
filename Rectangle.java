import java.util.*;
class Rectangle
{
static int rectarea(int l,int b)
{
return(l*b);
}
public static void main(String[] args)
{
int r,l,b;
Scanner sce=new Scanner(System.in);
System.out.println("Enter the length");
l=sce.nextInt();
System.out.println("Enter the length");
b=sce.nextInt();
r=rectarea(l,b);
System.out.println("Area of the rectangle is "+r);
System.out.println("length = "+l +" bredth = "+b);
}
}
