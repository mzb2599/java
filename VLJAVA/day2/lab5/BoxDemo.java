 class BoxDemo
{
    public static void main(String[] args) {
        double vol;
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        mybox1.Setdimension(10,10,10);
        mybox2.Setdimension(10,15,20);
        vol=mybox1.volume();
        System.out.println("Volume of Box1 is " +vol);
        vol=mybox2.volume();
        System.out.println("Volume of Box2 is " +vol);
 
    }
}
