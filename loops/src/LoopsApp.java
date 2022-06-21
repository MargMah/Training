import java.util.Scanner;

public class LoopsApp {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number");
//        int a = sc.nextInt();
//        int x =0;
//        while (x < a) {
//            System.out.println(x);
//            x++;}
//
//        for (x = 0; x < a; x++) ;
//        if (x % 2 == 0)
//            System.out.println(x);
        //   }


        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int F =1;
        //while (F<n) {
        //   System.out.println(F);
        //  F++;

        for (F = 1; F <n; F++)
        {
            if (F % 3 == 1)
                System.out.println("Fizz");
            else if (F % 5 == 1)
                System.out.println("Buzz");
            else if(F % 3 == 1 && F % 5 == 1) ;
            System.out.println("Fizzy Buzz");

    }


            public static double askForNumber(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Give me a number: ");
                double num1 = sc.nextDouble();
                return num1;
            }

            public static String askForOperator(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Give me the operator: ");
                String op = sc.next();
                return op;
            }

            public static void calculator(String op, double num1, double num2){
                switch (op) {
                    case "+":
                        System.out.println(num1 + num2);
                        break;
                    case "-":
                        System.out.println(num1 - num2);
                        break;
                    case "*":
                        System.out.println(num1 * num2);
                        break;
                    case "/":
                        System.out.println(num1 / num2);
                        break;
                    default:
                        System.out.println("Invalid operator");
                        break;
                }
            }

            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                String again;
                System.out.println("Welcome to the calculator");
                do {
                    double num1 = askForNumber();
                    double num2 = askForNumber();
                    String op = askForOperator();
                    calculator(op, num1, num2);
                    System.out.println("Again?");
                    again = sc.next();
                }while(again.equals("y"));
            }
        }
}}