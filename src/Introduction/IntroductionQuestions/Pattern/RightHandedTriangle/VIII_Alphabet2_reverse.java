package Introduction.IntroductionQuestions.Pattern.RightHandedTriangle;

import java.util.Scanner;

public class VIII_Alphabet2_reverse {
    public static void main(String[] args) {
        /**
         * a
         * b a
         * c b a
         */


        Scanner input=new Scanner(System.in);


        System.out.println("Enter the number: ");
         int num=input.nextInt();

         for(int row=1;row<=num;row++)
         {
             for(int col=row;col>=1;col--)
             {
                 System.out.print((char) ('a'+(col-1)) +" ");

             }
             System.out.println();

         }

    }
}
