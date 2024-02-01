package Introduction.IntroductionQuestions.LoopQuestions;

import java.util.Scanner;

public class Fibbonacci {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        /**
         * Given  a integer value "n" , Find "n"th fibonacci no;
         */


        System.out.println("Enter the number: ");
        int num=input.nextInt();


//        0 1 1 2 3 5 8 13
//        1 2 3 4 5 6 7 8
        int firstNum,secondNum;

        firstNum=0;
        secondNum=1;
//        int count=1;
        int fibbo=0;

//        while(count<=num)
//        {
//
//
//            System.out.println(firstNum);
//            int sum=firstNum+secondNum;
//            fibbo=firstNum;
//            firstNum=secondNum;
//            secondNum=sum;
//
//            count++;
//        }

        for (int count = 1; count <= num; count++) {
            System.out.println(firstNum);
            int sum = firstNum + secondNum;
            fibbo = firstNum;
            firstNum = secondNum;
            secondNum = sum;
        }
        System.out.println(fibbo);





    }
    }

