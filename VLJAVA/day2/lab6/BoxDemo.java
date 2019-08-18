import java.util.*;
class BoxDemo
{
    public static void main(String[] args) {
        double vol,vol1;
        Box mybox1= new Box();
        Box mybox2 = new Box();
        vol=mybox1.volume();
        mybox2.height=5; 
        mybox2.width=10;
        mybox2.depth=15;
        System.out.println("Volume of Box 1 is "+vol);
        vol1=mybox2.volume();
        System.out.println("Volume of Box 2 is "+vol1);
    }
}