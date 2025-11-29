import java.util.Scanner;
/**
 * Write a description of class scholar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scholar
{
    public static void main(String[] args){
   
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter GPA: ");
        float gpa = sc.nextFloat();

        System.out.print("Enter attendance percentage: ");
        float attendance = sc.nextFloat();

        System.out.print("Enter attitude score : ");
        int attitude = sc.nextInt();

        if ( gpa >= 3.2 ) 
        {
            if (attendance > 80)
            {
                if (attitude < 5)
                {
                    System.out.println(" Eligible for a scholarship.");
                } 
                else {
                    System.out.println("Not eligible due to bad attitude .");
                }
            } 
            else {
                System.out.println("Not eligible due to low attendance.");
            }
        } 
        else {
            System.out.println(" Not eligible for scholarship ");
        }

       
    }
}

    