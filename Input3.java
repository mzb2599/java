import java.util.*;
class Input3
{
    public static void main(String[] args) {
        int i,n,f=1;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the no whose factorial is to be found");
        n=Sc.nextInt();
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial is "+ f );
    }
}