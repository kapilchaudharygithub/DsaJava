package Introduction.IntroductionQuestions.LoopQuestions;

import java.util.Scanner;

public class PrintNumbersWithSomeDifference {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the starting  number: ");
        int start=input.nextInt();

        System.out.println("Enter the ending  number: ");
        int end=input.nextInt();

        System.out.println("Enter the gap between numbers: ");
        int gap=input.nextInt();


        for (int i=start;i<=end;i++)
        {
            System.out.println(i);
            i+=gap;
        }

    }
}
