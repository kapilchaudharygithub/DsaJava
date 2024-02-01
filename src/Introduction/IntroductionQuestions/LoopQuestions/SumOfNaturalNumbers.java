package Introduction.IntroductionQuestions.LoopQuestions;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first starting natural number: ");
        int start=input.nextInt();
        System.out.println("Enter the last natural number: ");
        int end=input.nextInt();
        int sum=0;

        for (int i = start; i <=end ; i++) {
            sum+=i;


        }
        System.out.println(sum);

    }
}
