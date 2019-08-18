class Box{
    double width;
    double height;
    double depth;

    Box()
    {
        System.out.println("DEFAULT CONSTRUCTOR");
        width=10;
        height=15;
        depth=20;
    }
    void Setdimension(double w,double h,double d)
    {
        width=w;
        depth=d;
        height=h;
    }
    double volume()
    {
     return(width*height*depth);
    }
}