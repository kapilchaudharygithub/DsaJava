package Introduction.IntroductionQuestions.Pattern.SolidRectangle;

import java.util.Scanner;

public class IX_NumberPattern {
    public static void main(String[] args) {
        /**
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=input.nextInt();
        int count=1;

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                System.out.print(count+" ");
                count++;

            }
            System.out.println();
        }
    }
}
