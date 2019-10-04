import java.util.*;
class Matrix{
    public static int b[][]=new int[10][10];
    public static int a[][]=new int[10][10];
    public static int c[][]=new int[10][10];
    public static int d[][]=new int[10][10];
    private static int n;
    public static void Addmatrix(){
            int i,j; 

      for ( i = 0; i < n ; i++) {
        for(j=0;j<n;j++){
            c[i][j]=a[i][j]+b[i][j];
    }
    }
    }
    
    public static void displaymatrix(int m[][])  {  
    int i,j; 
        for ( i = 0; i < n; i++) {
        System.out.println();
         for ( j = 0; j < n; j++) {
         System.out.print(m[i][j]+"\t");   
        }
    }
    }
    
    public static void transpose() {
    int i,j; 
        for ( i = 0; i < n; i++) {
           for ( j = 0; j < n; j++) {
            d[i][j]=c[j][i];
    }
    }
    }
    public static void main(String[] args) {
    int i,j; 
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the number of elements");
    n=Sc.nextInt();
    for ( i = 0; i < n; i++) {
        for(j=0;j<n;j++){
        
            System.out.println("Enter the element a["+i+"]"+"["+j+"]=");
            a[i][j]=Sc.nextInt();       
    }
    }
      for ( i = 0; i < n; i++) {
        for(j=0;j<n;j++){
            System.out.println("Enter the element b["+i+"]"+"["+j+"]=");
            b[i][j]=Sc.nextInt();
        }
    }
    Addmatrix();
    displaymatrix(c);
    System.out.println("Enter the matrix whose transpose is to be found");
    System.out.println("Size :");
    int t=Sc.nextInt();
    for ( i = 0; i < t; i++) {
        for(j=0;j<t;j++){
            System.out.println("Enter the element b["+i+"]"+"["+j+"]=");
            d[i][j]=Sc.nextInt();
        }
    } 
    transpose(d[][]);

      }
}