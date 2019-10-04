import java.util.*;
class Prime1 {
    public static void main(String[] args) 
    {
     int i,n,c=0;
    for(n = 2; n < 1000 ; n++)
    {
    //To check Prime numbers 1 to 1000
    for ( i = 2; i <n; i++)   
    {
        if(n%i==0)
        {
         break;
        }
    }
     //Number divisible by itself and by 1 
    if(i==n)
     System.out.println(n);
    c=0;
    }
    }
}