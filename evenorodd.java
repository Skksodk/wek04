import java.util.Scanner;

/**
 * Write a description of class evenorodd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class evenorodd
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number ");
        int num=sc.nextInt();
        
        if(num%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}