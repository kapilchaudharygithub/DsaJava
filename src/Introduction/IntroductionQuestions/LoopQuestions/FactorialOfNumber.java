package Introduction.IntroductionQuestions.LoopQuestions;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner  input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=input.nextInt();
        int fact=1;

        while(num>=1)
        {
            fact*=num;

           num--;
        }

        System.out.println(fact);
    }
}
