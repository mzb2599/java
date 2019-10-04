import java.util.*;
class Methodoverload{
    public void Area(double x,double y){
        double v;
        v=0.5*x*y;
        System.out.println("area of triangle = "+v);
        }
    public void Area(double r){
        double v;
        v=3.14*r*r;
        System.out.println("Area of circle = "+v);
    }
    public static void main(String[] args) {
        int choice;
        double base,height,radius,Area;
        System.out.println("Enter the area to be found");
        Scanner Sc=new Scanner(System.in);
        System.out.println("1-triangle");
        System.out.println("2-circle");
        choice=Sc.nextInt();
        switch(choice) {
            case  1:System.out.println("Enter the base value of triangle");
                    base=Sc.nextDouble();
                    height=Sc.nextDouble();
                    Methodoverload a=new Methodoverload();
                    a.Area(base,height);                
                break;
            case  2:System.out.println("Enter the radius of circle");
                    radius=Sc.nextDouble();
                    Methodoverload b = new Methodoverload();
                    b.Area(radius);
                break;
        }
    }
     
}