package com.calculator.program;


import java.util.Scanner;

public class Calculator {

       public static void main(String[]args){

           double number1;
           char operator;
           double number2;
           try (Scanner sc = new Scanner(System.in)) {
               number1 = sc.nextDouble();

               operator = sc.next().charAt(0);

               number2 = sc.nextDouble();
           }
           double  result;


               switch (operator){
                   case '+':
                       result = number1 + number2;
                       System.out.println(result);
                       break;
                   case '-':
                       result = number1 - number2;
                       System.out.println(result);
                       break;
                   case '*':
                       result = number1 * number2;
                       System.out.println(result);
                       break;
                   case '/':
                       result = number1 / number2;
                       System.out.println(result);
                       break;

                   default:
                       System.out.println("Invalid operator");
                       break;
               }

        }


}
