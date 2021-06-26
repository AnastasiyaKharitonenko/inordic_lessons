package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //   Scanner calc = new Scanner(System.in);
        //  double x; double y; double result;

        //  System.out.println( "Введите первое число: ");
        //  x = calc.nextDouble();
        //  System.out.println( "Введите второе число: ");
        //  y = calc.nextDouble();

        //  result = x+y;
        //  System.out.println( "Сумма равна: " + result);


        Scanner Scanner = new Scanner(System.in);

        double numFirst;
        double numSecond;

        System.out.println("Привет, я твой калькулятор!");

        System.out.println("\n Выберите операцию между (*,/,+,-,^,%)\n Введите операцию: ");
        String Operation = Scanner.nextLine();

        int i = 0;

        for (int u = 0; u < 3; u++) {
            if (Operation.equals("*") || Operation.equals("/") || Operation.equals("*") || Operation.equals("-") || Operation.equals("^") || Operation.equals("mod")) {
                break;
            } else {
                System.out.println("Вы ввели неверную операцию! Попробуйте еще!");
                Operation = Scanner.nextLine();

            }
            i++;
            if (i == 2) {
                System.out.println("Вы использовали все попытки");
                System.exit(0);
            }

        }

//        int u = 0;
//        do {
//            if (u > 0) {
//                System.out.println("Попробуйте еще раз");
//            }
//            Operation = Scanner.nextLine();
//            System.out.println("Operation = " + Operation);
//            u++;
//        } while (!Operation.equals("*") && !Operation.equals("/") && !Operation.equals("*") &&  !Operation.equals("-")  && u < 4);

        System.out.println("\n Введите первое число");
        numFirst = Scanner.nextDouble();

        if (Operation.equals("^")) {
            System.out.println("Введите в степень");
        } else {
            System.out.println("\n Введите второе число");
        }

        numSecond = Scanner.nextDouble();


        switch (Operation) {

            case "*":
                System.out.println(" \n Ваш результат: " + (numFirst * numSecond));
                break;
            case "/":
                if (numSecond == 0) {
                    System.out.println("Нельзя делить на ноль! ");

                    break;

                }
                System.out.println("  \n Ваш результат: " + (numFirst / numSecond));


                if (numFirst % numSecond == 0) {
                    System.out.println("\n число делится без остатка " + numFirst / numSecond);
                }

                if (numFirst % numSecond != 0) {
                    System.out.println(" \n число делится с остатком" + ": " + numFirst % numSecond);
                }
                break;

            case "+":
                System.out.println(" \n Ваш результат: " + (numFirst + numSecond));
                break;
            case "-":
                System.out.println(" \n Ваш результат: " + (numFirst - numSecond));
                break;
            case "%":
                System.out.println(" \n Ваш результат: " + (numFirst % numSecond));
                break;
            case "^":
                double resultStepen = 1;
                for (int s = 0; s < numSecond; s++) {
                    resultStepen = resultStepen * numFirst;
                }
                System.out.println(" \n Ваш результат: " + (resultStepen));
                break;

            default:
                System.out.println("Вы ввели неверную математическую операцию");

        }

    }

}
