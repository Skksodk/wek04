import java.util.Scanner;

/**
 * Write a description of class Gradeconvert here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gradeconvert
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("enter your gpa");
        float gpa = sc.nextFloat();
        
        
        if(gpa>=0.0f && gpa<=1.20f)
        {
    
           System.out.println(" E" );
        }
        else if(gpa>=1.21f && gpa<=2.0f)
        {
            
           System.out.println(" D " );
        }
        else if(gpa>=2.01f && gpa<=2.80f)
        {
            
           System.out.println(" C " );
        }
        else if(gpa>=2.81f && gpa<=3.20f)
        {
            
           System.out.println(" B " );
        }
        else if(gpa>=3.21f && gpa<=3.60f)
        {
            
           System.out.println(" A " );
        }
        else if(gpa>=3.61f && gpa<=4.0f)
        {
            
           System.out.println(" A+ " );
        }
        
        else
        {
            System.out.println("invalid" );
        }
        
        
        }
    
}