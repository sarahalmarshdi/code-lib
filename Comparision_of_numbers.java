
import java.util.Scanner;
public class soso{

public static void main(String[]args)
{ Scanner in = new Scanner(System.in);
    System.out.println("Pleas enter hte first  number");
   int x =in.nextInt();
   System.out.println("Pleas enter hte second  number");
    int y = in.nextInt();
    System.out.println("Pleas enter hte third  number");
    int z =in.nextInt();
    
    if (x>y&& x>z)
    System.out.println("the greatest number is " + x);
    
    else if (y>x && y>z)
    System.out.println("the greatest number is " + y);
    else 
     System.out.println("the greatest number is " + z);
     if (x<y && x<z)
      System.out.println("the smallest number is " + x);
      else if (y<x && y<z)
      
       System.out.println("the smallest number is " + y);
       else 
        System.out.println("the smallest number is " + z);
    }
    
    
    
    


}
    
