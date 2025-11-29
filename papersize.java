import java.util.Scanner;

/**
 * Write a description of class papersize here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class papersize
{
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter paper size : ");
        String size = sc.nextLine();

        switch (size)
        {
            case "A0":
                System.out.println("A0: 841x1189 mm (33.1 x 46.8 inches)");
                break;
            case "A1":
                System.out.println("A1: 594x841 mm (23.4 x 33.1 inches)");
                break;
            case "A2":
                System.out.println("A2: 420x594 mm (16.5 x 23.4 inches)");
                break;
            case "A3":
                System.out.println("A3: 297x420 mm (11.7 x 16.5 inches)");
                break;
            case "A4":
                System.out.println("A4: 210x297 mm (8.3 x 11.7 inches)");
                break;
            case "A5":
                System.out.println("A5: 148x210 mm (5.8 x 8.3 inches)");
                break;
            default:
                System.out.println(" Invalid paper size ");
        }
    }
}
