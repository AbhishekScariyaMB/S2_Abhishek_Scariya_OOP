import java.io.*;
import java.util.*;
public class read{
    public static void main(String[] args)
    {
    
           String var="";
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter Contents to file.. Exit to stop");
           while(!var.endsWith("exit"))
           var=var+scan.nextLine()+"\n";
    try 
       {
           File file=new File("Output.txt");
           FileWriter fw= new FileWriter("Output.txt");
           fw.write(var);
           fw.close();
           System.out.println("File writing done");
       } 
       catch (Exception e) 
       {
           System.out.println("There is some I/O Exception");
       }
    }
}