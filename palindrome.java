import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) 
    {
        System.out.println("plz enter your number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number1 = number ;
        int number2 = 0 ;
        int number3 ;
            while (number1!=0) 
            {
             number3 =number1 % 10 ;
             number2 = number2*10 + number3 ;
             number1/=10 ;
            }

                if (number2==number) 
                {
                    System.err.print( "your number is palindrome");
                }
                    else
                    {
                        System.err.print( "your number is not palindrome");        
                    }
        
    }
}
