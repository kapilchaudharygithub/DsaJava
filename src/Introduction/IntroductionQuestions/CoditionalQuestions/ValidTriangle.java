package Introduction.IntroductionQuestions.CoditionalQuestions;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        /**
         *  Given 3 angles of triangle . you neeed to  check wheather a valid triangle can be formed  from those 3 angles
         *eg: 60 30 90--->"valid Triangle"
         *    90 20 30--->"Invalid Triangle"
         *
         */


         System.out.println("Enter 3 angles:  ");
                int angle1=input.nextInt();
                  int angle2=input.nextInt();
                  int angle3=input.nextInt();

                 int sum=angle1+angle2+angle3;

                  if(sum==180 && angle1>0 && angle2>0 && angle3>0 )
                  {
                      System.out.println("Valid triangle");
                  }
                  else{
                      System.out.println("Invalid triangle1");
                  }

    }
}
