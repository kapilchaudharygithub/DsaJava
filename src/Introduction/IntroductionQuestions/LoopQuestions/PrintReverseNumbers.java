package Introduction.IntroductionQuestions.LoopQuestions;

import java.util.Scanner;

public class PrintReverseNumbers {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the last number form where you want start with: ");

        int num=input.nextInt();

        System.out.println("Start printing reverse numbers");

        while(num>=1)
        {
            System.out.println(num);

            num--;
        }

    }
}
