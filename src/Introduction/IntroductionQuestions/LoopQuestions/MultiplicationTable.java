package Introduction.IntroductionQuestions.LoopQuestions;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the table no: ");
        int table=input.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println( table +" * " + i +" = " + table*i);
        }
    }
}
