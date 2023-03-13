import java.util.Scanner;

class Weight{ 
     public static void  printResult( String name , double BMI ){
         Scanner in =new Scanner(System.in);
         
         System.out.println(" weight");
         double  x=in.nextDoble();
          System.out.println(" height");
         double y =in.nextDoble();
         if( x/(y*y)         
          
         double BMI; 
         switch (BMI){
         case (BMI<18.5):
         System.out.println("underweight");
         break;
         case  (18.5<=BMI>=24.9):
         SYstem.out.println("Normal");
         break ;
         case (25.0<=BMI>=29.9):
           System.out.println("Overweight");
           break ;
          case(BMI>30):
            System.out.println("Very Overweight");
           break;
    default :  System.out.println("Not underweight,Normal, Overweight andVery Overweight") ;
}
System.out.print("the BMI" + BMI);
}}
            
         