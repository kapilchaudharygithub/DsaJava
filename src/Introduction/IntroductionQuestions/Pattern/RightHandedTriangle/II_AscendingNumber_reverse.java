package Introduction.IntroductionQuestions.Pattern.RightHandedTriangle;

import java.util.Scanner;

public class II_AscendingNumber_reverse {
    public static void main(String[] args) {
        /**
         * 3 2 1
         * 2 1
         * 1
         */
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=input.nextInt();

        for(int row=num;row>=1;row--)
        {
            for(int col=row;col>=1;col--)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
