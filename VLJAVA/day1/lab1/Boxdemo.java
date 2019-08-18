Class Boxdemo{
    public static void main(String[] args) {
        double vol;
        Box mybox = new Box ();
        mybox.width = 5;
        mybox.length = 10;
        mybox.height = 20;
        vol=mybox.width*mybox.length*mybox.height;
        System.out.println("Volume is "+vol);
    }
}