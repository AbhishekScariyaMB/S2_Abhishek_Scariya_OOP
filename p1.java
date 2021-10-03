import java.io.File;
import java.util.*;
import java.io.*;
public class p1
{   public static final String Red="\033[0;31m";
public static final String Reset="\033[0m";
    static void RecursivePrint(File[] arr,int index,int level,String searchfor)
    {
        if(index==arr.length)
        return;
        for(int i=0;i<level;i++)
        {
            System.out.print("\t");
        }
         if(arr[index].getName().toLowerCase().contains(searchfor))
            {
                System.out.println(Red);
            }
           else
           {
            System.out.println(Reset);
           } 

        if(arr[index].isFile())
        System.out.println(arr[index].getName());
        else if(arr[index].isDirectory())
        {
            System.out.println("["+arr[index].getName()+"]");
            RecursivePrint(arr[index].listFiles(),0,level+1,searchfor);
        }

    }
     public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the directory path");
        String mainpath=scan.nextLine();
        System.out.println("Enter file/directory name:");
        String searchfor=scan.nextLine();
        File maindir= new File(mainpath);
        if(maindir.exists()&&maindir.isDirectory())
        {
            File arr[]=maindir.listFiles();
            System.out.println("#####################################");
            System.out.println("Files from main dir"+maindir);
            System.out.println("#####################################");
            RecursivePrint(arr,0,0,searchfor.toLowerCase());
        }
    }
}