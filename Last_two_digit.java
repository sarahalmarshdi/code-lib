import java.util.Scanner;

public class Sarah{
public static void main (String[]args ){
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the last two number of your student ID ");
    int x =in.nextInt();
    int digit1 = x/10;
    int digit2 = x-(digit1 *10);
    System.out.println("The digit1 ="+ digit1);
     System.out.println("The digit2 ="+ digit2);
     int v =digit2 * digit1 ;
   System.out.println("Product:"+ v);
     int sum = digit2 + digit1;
     System.out.println("The sum"+ sum);
     double average = (digit2 + digit1)/2;
     System.out.println("THe avrege" + average );
     if (digit2 > digit1){
           System.out.println("The maximum is " + digit2 ); }
           else {    System.out.println("The maximum is "+ digit1);}
           

    
    
}}
