package Introduction.IntroductionQuestions.CoditionalQuestions;

import java.util.Scanner;

public class ValidTriangleSIde {
    public static void main(String[] args) {
        /**Vaid Triangle
         * If we want to create a triangle with 3 sides then for  each side the sum of 3 sides should be greater
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 sides of triangle: ");
        int side1=input.nextInt();
        int side2=input.nextInt();
        int side3=input.nextInt();

        if(side1+side2>side3 && side2+side3>side1 && side1+side3>side2)
        {
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Not a  valid triangle");
        }



    }
}
