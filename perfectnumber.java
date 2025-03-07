import java.util.Scanner;

public class perfectnumber 
{
    public static void main(String[] args) 
    {
    System.out.println("plz enter your number");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int y = 0 ;
        for(int x = 1 ;x <= (number/2); x++)
        {
        y = x + y;
        }
            if (number/y == 1)
            {
            System.out.println("your number is perfect number");    
            }
                else
                {
                System.out.println("your number is not perfect number");        
                } 
            
    }
    
}
