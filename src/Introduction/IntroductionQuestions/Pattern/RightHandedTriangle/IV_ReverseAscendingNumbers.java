package Introduction.IntroductionQuestions.Pattern.RightHandedTriangle;

import java.util.Scanner;

public class IV_ReverseAscendingNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=input.nextInt();

        for(int row=1;row<=num;row++)
        {
            for(int col=row;col>=1;col--)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
