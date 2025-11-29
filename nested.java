import java.util.Scanner;

/**
 * Write a description of class nested here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nested
{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number : ");
        int num=sc.nextInt();
        if(num%3==0)
        {
            if(num%5==0)
            {
                System.out.println("Number is divisible by both 5 and 3");
            }
            else{
                System.out.println("Divisible by 3 but not 5");
            }
        }
        else if(num%5==0)
        {
            if(num%3==0)
            {
                System.out.println("Number is divisible by both 5 and 3");
            }
            else{
                System.out.println("Divisible by 5 but not 3");
            }
        }
        else {
            System.out.println("number is divisible by neither 3 nor 5");
        }
    }
        
}