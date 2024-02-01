package Introduction;

public class Conditionals {
    public static void main(String[] args) {

        /**
         * if, if_else, if_elseIf_else, nested if_else
         * switch statements-->allow us to execute a block of code among many alternatives
         * switch(expression){
         *   case val1:
         *        code
         *        break;
         *    default:
         *         default code
         *
         *
         *  without  break--> doesn't check any case and just simply execute all instructions simultaneously
         *  break -->going to  keep you out from switch statement if you find out your value ones
         *
         *  generally used to work with integer and strings not with floating numbers
         */

        int num=51;
         String size;
         switch(num){
             case 29:
                 size="small";
                 break;
             case 42:
                 size="Large";
                 break;
             case 50:
                 size="extra large";
                 break;
             default:
                 size="unknown";
                 break;
         }
        System.out.println(size);

        /**Ternary Operator
         *
         */

        byte a=(byte) 129;
//        int a=130
        System.out.println(a);


    }
}
