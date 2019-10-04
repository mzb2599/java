import java.util.*;
class Rectangle{
        int l,w;
        Rectangle(int x,int y)
        {
            l=x;
            w=y;
        }
        int Rectarea()
        {
            return(l*w);
        }
}
class RectangleArea
{
    public static void main(String[] args) {
        Rectangle r =new Rectangle(10,50);
        int area =r.RectangleArea();
        System.out.println("Length of Rectangle is "+ l+"Bredth of rectangle is "+ b);
        System.out.println("Area of Rectangle is "+area);
    }
}