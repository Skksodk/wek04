import java.util.Scanner;

/**
 * Write a description of class Sellingprice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sellingprice
{
    public static void main(String[] args){
    float Sp;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter marked price : ");
    float mp=sc.nextFloat();
    
    System.out.println("enter the product category");
    char category= sc.next().charAt(0);
    
    if(category=='A')
        {
            Sp=mp -(mp*0.6f);
                System.out.println("the sp is" +Sp);
            }
         else   if(category=='B')
        {
            Sp=mp -(mp*0.4f);
                System.out.println("the sp is" +Sp);
            }
         else   if(category=='C')
        {
            Sp=mp -(mp*0.2f);
                System.out.println("the sp is" +Sp);
            }
           else if(category=='D')
        {
            Sp=mp -(mp*0.1f);
                System.out.println("the sp is" +Sp);
            }
            else{
                Sp=mp;
                System.out.println("the sp is" +Sp);
            }
          
        
    
    }
}