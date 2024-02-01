package Introduction.IntroductionQuestions.CoditionalQuestions;

import java.util.Scanner;

public class EvenOdd {
    public static void main (String[] args)
    {
        Scanner input=new Scanner(System.in);
        /**
         * Take a user input which is an iteger . If the input value is even or odd
         *
         */

                 System.out.println("Enter a number: ");
                  int number=input.nextInt();

                  if(number%2==0)
                  {
                      System.out.println(number +" is even");
                  }
                  else{
                      System.out.println(number+" is odd");
                  }

    }

}

