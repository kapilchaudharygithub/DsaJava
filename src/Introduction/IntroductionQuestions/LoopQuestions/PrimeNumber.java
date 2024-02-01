package Introduction.IntroductionQuestions.LoopQuestions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        /**
         * Given a input integer you need to tell if it is prime or not.
         *
         * A number which is either divisible by 1 or number itself.
         */

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num=input.nextInt();


        Boolean isPrime=true;
            for (int i = 2; i <num; i++) {
                if(num%i==0)
                {
                    isPrime=false;
                    break;

                }



            }


        /**
         * int num2=2;
         *         while(num2<num)
         *         {
         *             if(num%num2==0)
         *             {
         *                 isPrime=false;
         *                 break;
         *             }
         *             num2++;
         *         }
         */


       if(isPrime)
       {
           System.out.println("Number is Prime");
       }
       else{
           System.out.println("Number is not prime");
       }


    }
}
