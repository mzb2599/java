import java.util.*;
class Package{
public static void main(String[] args) {
int id,qty,price;
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the id");
id=Sc.nextInt();
System.out.println("Enter the quantity");
qty=Sc.nextInt();
System.out.println("Enter the price");
price=Sc.nextInt();
detail a=new detail();
a.getdata(id,qty,price);
a.putdata();
}
}