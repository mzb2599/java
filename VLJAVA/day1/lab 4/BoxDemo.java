class BoxDemo {
    public static void main(String[] args) {
        double vol;
        Box b1 = new Box();
        Box b2 = new Box();
        b1.width = 10;
        b1.height = 20;
        b1.depth = 30;
        b2.width = 20;
        b2.height = 25;
        b2.depth = 30;
        vol = b1.volume();
        System.out.println("volume is" + vol);
        System.out.println("volume is" + b2.volume());
    }
}