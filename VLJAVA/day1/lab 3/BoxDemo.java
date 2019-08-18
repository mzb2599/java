class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
        b1.width = 10;
        b1.height = 20;
        b1.depth = 30;
        b2.width = 20;
        b2.height = 25;
        b2.depth = 30;
        b1.volume();
        b2.volume();
        Box b3 = new Box();
        b3.width = 10;
        b3.height = 40;
        b3.depth = 20;
        b3.volume();
    }
}