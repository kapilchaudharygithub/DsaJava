package Introduction.IntroductionQuestions.LoopQuestions;

import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a valid number: ");

        int num=input.nextInt();
        int ans=0;

        while(num>0)
        {
           int rem=num%10;
           ans=ans*10+rem;
           num/=10;
        }
        System.out.println(ans);

    }
}
