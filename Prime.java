import java.util.*;
class Prime {
    public static void main(String[] args) 
    {
     int i,n,c=0;
     System.out.println("Enter the number to be checked");//Number to be checked
     Scanner Sc = new Scanner(System.in);
     n = Sc.nextInt();
    //To check Prime numbers
     for ( i = 1; i <=n; i++)   
    {
        if(n%i==0)
        {
         c++;
        }
     }
     //Number divisible by itself and by 1 
    if(c==2)
     System.out.println(n +" is a prime number\n");
    else 
     System.out.println(n +" is not a prime number");
    c=0;
    }
}