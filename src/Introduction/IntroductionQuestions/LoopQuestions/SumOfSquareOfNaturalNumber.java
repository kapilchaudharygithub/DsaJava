package Introduction.IntroductionQuestions.LoopQuestions;

import java.util.Scanner;

public class SumOfSquareOfNaturalNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the starting number: ");
        int firstNum=input.nextInt();

        System.out.println("Enter the last number: ");
        int lastNumber=input.nextInt();
        int sum=0;


        for(int i=firstNum;i<=lastNumber;i++)
        {
            sum+=i*i;

        }

        System.out.println(sum);





    }
}
