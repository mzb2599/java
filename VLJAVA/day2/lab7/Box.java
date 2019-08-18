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
    void Box(double width,double height,double depth)
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    double volume()
    {
     return(width*height*depth);
    }
}