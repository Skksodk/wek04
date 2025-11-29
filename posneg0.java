import java.util.Scanner;

/**
 * Write a description of class posneg0 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class posneg0
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number : ");
        int num=sc.nextInt();
        if (num>0)
        {
            System.out.println("the number is positive");
        }
        else if (num==0){
            System.out.println("number is zero");
        }
        else{
            System.out.println("number is negative");
        }
    }
}