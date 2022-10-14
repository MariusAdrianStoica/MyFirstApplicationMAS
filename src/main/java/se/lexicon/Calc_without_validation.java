package se.lexicon;
import java.util.Scanner;

public class Calc_without_validation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the calculator!");
        char loop = 'Y';

        while (loop == 'Y'|| loop == 'y'){
            System.out.println("Please enter the first number:");
            double num1 = sc.nextDouble();

            System.out.println("Please enter the second number:");
            double num2 = sc.nextDouble();

        System.out.println("Please enter the operator (+,-,*,/):");
        char operator = sc.next().charAt(0);

        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println(operator + " is not supported");
                }
        if (operator == '+'||operator == '-'|| operator == '*' || operator == '/') {
            System.out.println("Your calculation:" + num1 + " " + operator + " " + num2
                    + " = " + result);
        }else {
                System.out.println("Operator must be (+,-,*,/)!");
            }
        System.out.println("If you want to have another calculation, please press Y:");
            loop = sc.next().charAt(0);
    }
        System.out.println("Thank you for using Calculator!");
}
}

