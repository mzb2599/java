class Box
 {
    double width;
    double height;
    double depth;
    double volume()
    {
        return(width*height*depth);
    }
    void Setdimension(double h,double w,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
 }