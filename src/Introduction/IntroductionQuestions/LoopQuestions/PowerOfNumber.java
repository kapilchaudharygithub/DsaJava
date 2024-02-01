package Introduction.IntroductionQuestions.LoopQuestions;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=input.nextInt();

        System.out.println("Enter the power: ");
        int pow=input.nextInt();

        int ans=1;

        for (int i=1;i<=pow;i++)
        {
            ans*=num;
        }
        System.out.println(ans);
    }
}
