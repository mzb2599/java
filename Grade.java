import java.util.*;
class Grade {
    public static void main(String[] args) {
        float p;
        int g;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your Pointer");
        p = Sc.nextFloat();
        g = (int) p;
        switch (g) {
            case 10:
            System.out.println("Your grade is O");
                
                break;
                case 9:
            System.out.println("Your grade is A");
                
                break;
                case 8:
            System.out.println("Your grade is B");
                
                break;
                case 7:
            System.out.println("Your grade is C");
                
                break;
                case 6:
            System.out.println("Your grade is D");
                
                break;
                case 5:
            System.out.println("Your grade is P");
                
                break;
                case 4:
                case 3:
                case 2:
                case 1:System.out.println("You have failed");
                break;
            
        
            default:System.out.println("Invalid input");
                break;
        }
    }
}