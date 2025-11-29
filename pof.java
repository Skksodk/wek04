import java.util.Scanner;

/**
 * Write a description of class pof here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pof
{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your marks : ");
        int marks=sc.nextInt();
        if (marks>=40){
            System.out.println("you have passed");
        }
        else{
            System.out.println("you have failed");
        }
        
        
    }
}