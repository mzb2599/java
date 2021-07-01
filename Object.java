public class Object {
    
    Object(int id,String name) {
    System.out.println("Constructor called"+"id: "+id+"name:"+name);    
    } 
    public static void main(String[] args) {
        Object p = new Object(1, "James Ghosling");
        System.out.println(p);        
    }
}