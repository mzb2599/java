import java.io.*;

class Input1
{ 
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(isr);
        System.out.println("Enter your name");
        String name = b.readLine();
        System.out.println("Welome " + name);
        b.close();
        isr.close();
    }     
    
}