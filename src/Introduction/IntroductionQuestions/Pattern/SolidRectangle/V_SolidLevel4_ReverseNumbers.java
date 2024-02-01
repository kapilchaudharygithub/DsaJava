package Introduction.IntroductionQuestions.Pattern.SolidRectangle;

import java.util.Scanner;

public class V_SolidLevel4_ReverseNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the num: ");
        int num=input.nextInt();

        for (int row = 1; row <=num ; row++) {
            for(int col=num;col>=1;col--)
            {
                System.out.print(col+" ");

            }
            System.out.println();

        }
    }

}
