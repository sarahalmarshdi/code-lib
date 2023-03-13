
import java.util.Scanner;

public class Number_calcilator
{
    public static void main(String[] args) {
        int [] studentID = {2,1,0,0,4,5,6,1,8};
        
        System.out.println("your student's No is : ");
        for (int i : studentID)
    {
        System.out.print(i);
}
        System.out.println();
        Scanner in = new Scanner (System.in);
        System.out.println("pleas enter a number between 1 & 9");
        int num = in.nextInt();
        int count = 0 ;
        int even = 0;
        int odd = 0 ;
        int sum = 0 ;
        
        for (int i : studentID) 
        { 
            if (i% num == 0)
            { count++;
            }
            if (i < num && i% 2==0)
            {even++;
            }
            if(i < num && i % 2 != 0 )
            { odd++; 
                
            }
            if (i %3==0 || i% 4==0 ){
                sum+=i;
                
            }
            }
            System.out.println("The count of numbers divisible by" +   num  + "is"  + count);
             System.out.println("Numbers of even numbers less than "+  num  + "is"  + even);
              System.out.println("Numbers of odd numbers less than "+ num   +"is "  + odd );
               System.out.println("Sum of numbers that are divisible by 3 or 4 is " +  sum);
        
    }
}
