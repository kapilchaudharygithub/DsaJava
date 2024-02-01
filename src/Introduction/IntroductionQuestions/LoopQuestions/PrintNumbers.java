package Introduction.IntroductionQuestions.LoopQuestions;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        /**
         * Write  a program to print the no's from 1 to input number
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number till where you wanted to print the numbers");
        int tillNo=input.nextInt();
        for(int i=1;i<=tillNo;i++)
        {
            System.out.println(i);
        }
    }
}
