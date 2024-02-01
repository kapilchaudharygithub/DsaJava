package Introduction.IntroductionQuestions.Pattern.RightHandedTriangle;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=input.nextInt();

        for(int row=1;row<=num;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
