class Person{
    public String name;
    public int age;
}

class Program{
    public static void main(String[] args) {
        Person zaki = new Person();
        zaki.name = "Mohammed Zaki Bhojani";
        zaki.age = 19;
        System.out.println("Name is " + zaki.name);
        System.out.println("Age is " + zaki.age); 
    }
}