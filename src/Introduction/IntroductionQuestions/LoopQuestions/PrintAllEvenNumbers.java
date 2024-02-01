package Introduction.IntroductionQuestions.LoopQuestions;

import java.util.Scanner;

public class PrintAllEvenNumbers {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int start=input.nextInt();
        System.out.println("Enter the last numnber: ");
        int end=input.nextInt();

        for(int i=start;i<=end;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
