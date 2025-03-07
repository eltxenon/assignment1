import java.util.Scanner;

public class tree
{
    public static void main(String[] args) 
    {
        System.out.println("plz enter your number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
            for(int i = 1; i <= number;i++)
            {
                for(int k = 1 ; k<=number - i ; k++)
                {
                System.out.print(" ");
                }    
                    for(int j = 1; j<=(i*2)-1 ; j++)
                    {
                    System.out.print("*");
                    }
            System.out.print("\n");
            }
                            for(int i=1;i<=(number*2)/3;i++)
                            {     
                                for(int j=1;j<number;j++)
                                {
                                System.out.print(" ");
                                }
                            System.out.println("*");
                            }
    }
}
    

    

