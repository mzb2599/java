import java.util.*;
class Box{
    double width;
    double height;
    double depth;

    void Box()
    {
        System.out.println("DEFAULT CONSTRUCTOR");
        width=10;
        height=15;
        depth=20;
    }
    void Box(double w,double h,double d)
    {
        this.width=w;
        this.height=h;
        this.depth=d;
    }
    double volume()
    {
     return(width*height*depth);
    }
}