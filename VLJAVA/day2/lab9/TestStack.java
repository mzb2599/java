class TestStack{
    public static void main(String[] args) {
        int i;
        Stack mystack1=new Stack();
        Stack mystack2 =new Stack();
        for ( i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for ( i = 10; i < 20; i++) {
            mystack2.push(i);
        }
    mystack1.display(10);
    mystack2.display(10);
      for ( i = 0; i < 10; i++) {
          System.out.println(mystack1.pop());
      }
      for ( i = 10; i < 20; i++) {
        System.out.println(mystack2.pop());
    }
}
}