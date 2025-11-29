import java.util.Scanner;

/**
 * Write a description of class div3or5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class div3or5
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number : ");
        int num=sc.nextInt();
        
        if (num%3==0 && num%5==0){
            System.out.println("it is divisible by both 3 and 5");
        }
        else{
            System.out.println("it is not divisible by both 3 and 5");
        }
    }
}