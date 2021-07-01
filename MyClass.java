class Person{
    Person(){
        System.out.println("Constructor");
    }
}

class MyClass{
    public static void main(String[]args )
    {
        Person p = new Person();
        System.out.println(p);
    }
}