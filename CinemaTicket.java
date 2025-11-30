import java.util.Scanner;
/**
 * Write a description of class CinemaTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class CinemaTicket 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String age, language;
        String student, fest;
        double price=0 ;
        
        
        System.out.println("Please answer using small letters ! THANK YOU !! ");

        System.out.println("Enter age group (child/adult/senior): ");
        age = sc.nextLine();

        System.out.println("Enter movie language (nepali/hindi/english): ");
        language = sc.nextLine();

        System.out.println("Are you a student? (yes/no): ");
        student = sc.nextLine();

        System.out.println("Is it a festival day? (yes/no): ");
        fest = sc.nextLine();

        switch (age) {
            case "child":
                price = 150;
                break;
            case "adult":
                price = 250;
                break;
            case "senior":
                price = 200;
                break;
            default:
                System.out.println("Invalid age group");
        }

        
        switch (language) {
            case "nepali":
                break;
            case "hindi":
                price += 50;
                break;
            case "english":
                price += 100;
                break;
            default:
                System.out.println("Invalid language ");
        }

        if (student.equals("yes")) {
            price = price * 0.80;      
        }

        if (fest.equals("yes")) {
            price = price * 0.85;    
        }

     
        System.out.println("\nFinal Ticket Price = Rs " + price);

    }
}
