import java.util.Scanner;

public class Sarah{
public static void main (String[]args ){
    
    Scanner in = new Scanner(System.in);
    System.out.println("pleas enter your full name ");
    String x=in.nextLine();
     System.out.println("Welcome " + x);
      System.out.println("Pleas enter the amount in Riyal ");
      double y =in.nextDouble();
      double E = y* 0.2621 ;
       System.out.println(y + "(Riyal) =" + E+ "Euro" );
       System.out.println("pleas enter the amount in Euro");
       double z =in.nextDouble();
      double R = z/0.2621;
       System.out.println(z + "(Euro)=" + R +"(Riyal) " );
      
      
      
     
    
}
}