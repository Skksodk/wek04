import java.util.Scanner;

/**
 * Write a description of class Tax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tax
{
    public static void main(String[] args){
        double tax;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your annual income:");
        double income= sc.nextDouble();
        
        
        if (income<=500000)
        {
            tax= (0.01*income);
            System.out.println("Your total tax=" +tax);
        }
        else if (income>500000 && income<=700000)
        {
             tax= 5000 +(0.1*(income-500000));
            System.out.println("Your total tax=" +tax);
        }
        else if (income>700000 && income<=1000000)
        {
            tax= 15000 + (0.2*(income-700000));
            System.out.println("Your total tax=" +tax);
        }
        else if (income>1000000 && income<=2000000)
        {
           tax= 35000 + (0.3*(income-1000000));
            System.out.println("Your total tax=" +tax);
        }
        else if (income>2000000 && income<=5000000)
        {
            tax= 335000 + (0.36*(income-2000000));
            System.out.println("Your total tax=" +tax);
        }
        else if (income>5000000)
        {
            tax= 1135000 + (0.39*(income-5000000));
            System.out.println("Your total tax=" +tax);
        }
        }
    }