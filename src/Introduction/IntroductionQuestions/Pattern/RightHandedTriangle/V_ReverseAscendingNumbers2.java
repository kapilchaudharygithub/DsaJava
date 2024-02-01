package Introduction.IntroductionQuestions.Pattern.RightHandedTriangle;

import java.util.Scanner;

public class V_ReverseAscendingNumbers2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=input.nextInt();

        for(int row=num;row>=1;row--)
        {
            for(int col=row;col>=1;col--)
            {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
