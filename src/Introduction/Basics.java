package Introduction;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        /** Output in Java
         * Hello World in JAVA
         */

        /**
         * Way-1
         * System.out.print(")
         */
        System.out.print("Hello 1 From Print Function");
        System.out.print("Hello 2 From Print Function");
        /**
         * Print function generally prints in same Line
         */

        System.out.println();

        /**
         * Way-2
         * System.out.println(")
         */
        System.out.println("Hello 3 From Println Function");
        System.out.println("Hello 4 From Println Function");
        /**
         * Print function generally prints in different Line
         */

        /**
         * Way-3
         * System.out.prinf("")
         * It generally takes 2 things(msg,arg)
         */
        System.out.printf("Hello %d From Printf Function",5);

        System.out.printf("Hello %d From Printf Function",6);
        System.out.println();
        /**
         * Print function generally prints in same Line
         * Also it takes 2 things format and args it is also alike printf function in C
         *
         */

        /**
         * Input
         *
         * import Scanner
         *
         * Scanner input=new Scanner (System..in)
         * input.
         * string-->next()  --->read a word from user
         * int--->nextInt()
         *         input.nextLine()--->read a line of text from user
         *
         */

        Scanner input=new  Scanner(System.in);
        int a=input.nextInt();
        System.out.println(a);

        /**
         * Java Statements: Each statement is a complete unit of execution.
         * eg: int a=45;
         */

        /**
         * Expresions: are nothing much more than that the part of Java Statements
         */

        /**
         * Block of code : Anycode between {}
         */
    }
}
