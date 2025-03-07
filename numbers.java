public class numbers {
    public static void main(String[] args)
     {
        for(int i=2; i<=100; i++)
        {
            boolean number_is_aval = true ;
            for(int j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    number_is_aval = false ;
                }
            }
            if(number_is_aval == true){
                System.out.println(i+" aval ast");
            }
        }
    }
}
