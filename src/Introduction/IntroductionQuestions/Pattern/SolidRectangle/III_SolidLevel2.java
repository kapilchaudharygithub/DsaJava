package Introduction.IntroductionQuestions.Pattern.SolidRectangle;

import java.util.Scanner;

public class III_SolidLevel2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the num: ");
        int num=input.nextInt();

        for (int row = 1; row <=num ; row++) {
            for(int col=1;col<=num;col++)
            {
                System.out.print(row+" ");

            }
            System.out.println();

        }
    }
}