package Introduction.IntroductionQuestions.CoditionalQuestions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /**
         * Given an year,  print wheather a year is leap year or not.
         *  eg: 2014-->"Leap year
         *      2016-->"Not Leap Year"
         *
         *   A year is considered a leap year
         *   1. If year is exactly divisible by 4 and not divisible by 100 or,
         *   2. If year is  divisible by 400.
         *   then it is a leap year
         */
           System.out.println("Enter the year: ");
                  int year=input.nextInt();
                  if((year%4==0 && year%100!=0) || (year%400==0) )
                  {
                      System.out.println("Leap year");
                  }
                  else{
                      System.out.println("Not a leap year");
                  }
    }
}
