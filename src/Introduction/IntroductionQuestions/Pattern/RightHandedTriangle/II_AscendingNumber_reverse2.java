package Introduction.IntroductionQuestions.Pattern.RightHandedTriangle;

import java.util.Scanner;

public class II_AscendingNumber_reverse2 {

    public static void main(String[] args) {
        /**
         * 1 2 3
         * 1 2
         * 1
         */
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=input.nextInt();

        for(int row=num;row>=1;row--)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
