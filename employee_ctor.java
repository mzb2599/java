public class employee_ctor {
    int id;
    String name;
    public employee_ctor(int _id, String _name) {
        this.id  = _id;
        this.name = _name;
        System.out.println("Constructor called");
        System.out.println("Id:"+ id);
        System.out.println("name:"+ name);
    }
    public static void main(String[] args) {
        employee_ctor E = new employee_ctor(2, "Dennis Ritchie");
        System.out.println(E);
        System.out.println(E.id);
        System.out.println(E.name);
    }
}
