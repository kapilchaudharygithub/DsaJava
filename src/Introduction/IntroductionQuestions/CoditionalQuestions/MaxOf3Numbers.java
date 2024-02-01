package Introduction.IntroductionQuestions.CoditionalQuestions;

import java.util.Scanner;

public class MaxOf3Numbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /**
         *  Given 3 integer values . Find the maximum of 3 values.
         * INPUT-->10 20 15
         * OUTPUT-->20
         *
         * INPUT-->20 45 60
         * OUTPUT-->60
         *
         */
        System.out.println("Enter 3 numbers: ");
          int num1=input.nextInt();
                  int num2=input.nextInt();
                  int num3=input.nextInt();

                  if(num1>=num2 && num1>=num3)
                  {
                      System.out.println(num1+" is greater ");
                  }
                  else if(num2>=num1 && num2>=num3)
                  {
                      System.out.println(num2 +" is greater");
                  }
                  else{
                      System.out.println(num3 +" is greater");
                  }
    }
}
