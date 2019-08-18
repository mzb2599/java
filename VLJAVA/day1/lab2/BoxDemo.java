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
        vol = b1.width * b1.height * b1.depth;
        System.out.println("Vol of b1 is" + vol);
        Box b3;
        b3 = b1;
        b1 = null;
        vol = b3.width * b3.height * b3.depth;
        System.out.println("vol of b3 is" + vol);
    }
}