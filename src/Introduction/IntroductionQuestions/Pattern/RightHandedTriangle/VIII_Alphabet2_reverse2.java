package Introduction.IntroductionQuestions.Pattern.RightHandedTriangle;

import java.util.Scanner;

public class VIII_Alphabet2_reverse2 {
    public static void main(String[] args) {

        /**
         * c b a
         * b a
         * a
         */


        Scanner input=new Scanner(System.in);


        System.out.println("Enter the number: ");
        int num=input.nextInt();

        for(int row=num;row>=1;row--)
        {
            for(int col=row;col>=1;col--)
            {
                System.out.print((char) ('a'+(col-1)) +" ");

            }
            System.out.println();

        }
    }
}
