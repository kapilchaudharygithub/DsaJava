package Introduction.IntroductionQuestions.Pattern.SolidRectangle;

import java.util.Scanner;

public class VII_PatternOfAlphabets {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the num: ");
        int num=input.nextInt();

        for (int row = 1; row <=num ; row++) {
            char ch=(char)('a'+(row-1));
            for(int col=1;col<=num;col++)
            {
//                System.out.print((char)('a'+(row-1))+" ");
                System.out.print(ch+" ");

            }
            System.out.println();

        }
    }
}
