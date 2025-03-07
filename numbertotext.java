import java.util.Scanner;

public class numbertotext 
{
    public static String numbertofinglish(int number) 
    {
        if (number <= 0 || number > 1000) 
        {
            return "number between 1 to 1000 " ;
        }
        if (number == 1000) 
        {
            return "hezar";
        }

        String result = "";
        int hundred = number / 100;
        int remainder = number % 100;
        int ten = remainder / 10;
        int one = remainder % 10;

        switch (hundred) {
            case 1 : 
            result = "sad";
            break;
            case 2 : 
            result = "devist";
            break;
            case 3 : 
            result = "sisad";
            break;
            case 4 : 
            result = "chaharsad";
            break;
            case 5 : 
            result = "pansad";
            break;
            case 6 :
             result = "sheshsad";
             break;
            case 7 : 
            result = "haftsad";
            break;
            case 8 :
            result = "hashtsad";
            break;
            case 9 : 
            result = "nohsad";
        }

        if (remainder >= 10 && remainder < 20) 
        {
            switch (remainder) 
            {
                case 10 :
                 result += " dah" ;
                break;
                case 11 : 
                result += " yazdah" ;
                break;
                case 12 : 
                result += " davazdah" ;
                break;
                case 13 : 
                result += " sizdah" ;
                break;
                case 14 : 
                result += " chahardah" ;
                break;
                case 15 : 
                result += " poonzdah" ;
                break;
                case 16 : 
                result += " shoonzdah" ;
                break;
                case 17 : 
                result += " hefdah" ;
                break;
                case 18 : 
                result += " hejdah" ;
                break;
                case 19 : 
                result += " noozdah" ;
            }
        } 
        else 
        {
            switch (ten) 
            {
                case 1 : 
                result += " dah" ;
                break;
                case 2 : 
                result += " bist" ;
                break;
                case 3 : 
                result += " si" ;
                break;
                case 4 : 
                result += " chehel" ;
                break;
                case 5 : 
                result += " panjah" ;
                break;
                case 6 : 
                result += " shast" ;
                break;
                case 7 : 
                result += " haftad" ;
                break;
                case 8 : 
                result += " hashtad" ;
                break; 
                case 9 : 
                result += " navad" ;
            }

            switch (one) 
            {
                case 1 : 
                result += " yek" ;
                break;
                case 2 : 
                result += " do" ;
                break;
                case 3 : 
                result += " se" ;
                break;
                case 4 : 
                result += " chahar" ;
                break;
                case 5 : 
                result += " panj" ;
                break;
                case 6 : 
                result += " shesh" ;
                break;
                case 7 : 
                result += " haft" ;
                break;
                case 8 : 
                result += " hasht" ;
                break;
                case 9 : 
                result += " noh" ;
            }
        }

        return result.trim();
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("plz enter your number(1-1000): ") ;
        int number = scanner.nextInt() ;
        scanner.close() ;
        System.out.println("be finglish: " + numbertofinglish(number)) ;
    }
}
