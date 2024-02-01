package Introduction.IntroductionQuestions.CoditionalQuestions;

import java.util.Scanner;

public class CheckTriangleType {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /**
         *  3 sides of a triangle . check if it is equilateral,Isoscles or scalene
         * Equilateral--> all sides are equal
         * Isosclees--> 2 sides are equal
         * Scalene--> all 3 sides are different
         */
          System.out.println("Enter all 3 sides of triangle");
                  int side1=input.nextInt();
                  int side2=input.nextInt();
                  int side3=input.nextInt();

                  if(side1==side2 && side2==side3)
                  {
                      System.out.println("Equilateral Triangle");
                  }
                  else if(side1==side2 || side1==side3  || side2==side3)
                  {
                      System.out.println("Isosceles Triangle");
                  }
                  else{
                      System.out.println("Scalene Triangle");
                  }
    }
}
