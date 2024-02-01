package Introduction.IntroductionQuestions.CoditionalQuestions;

import java.util.Scanner;

public class CheckWeekDayByWeekNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /**
         *  Given the week number , find the corresponding day of the  week
         */
        System.out.println("Enter the week number: ");
        int weekNumber=input.nextInt();
        switch (weekNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
