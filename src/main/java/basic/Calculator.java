package basic;
import advance.Employee;

import java.util.Scanner;

public class Calculator extends Employee {
    public static void main(String[] arg) {
        System.out.println("Please enter the first number : ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Please enter the second number : ");
        int number2 = scanner.nextInt();
        int additionResult = addition(number1, number2);
        System.out.println("Addition Result: " + additionResult);
        int subtractResult = subtract(number1, number2);
        System.out.println("Subtraction Result: " + subtractResult);
        int multiplicationResult = multiplication(number1, number2);
        System.out.println("Multiplication Result: " + multiplicationResult);
        double divisionResult = division(number1, number2);
        System.out.println("Division Result: " + divisionResult);
        scanner.close();
        //Calculator calculator = new Calculator();
        //static and non static problem checking
        //System.out.println(calculator.test(10));
    }
    private static int subtract(int number1, int number2) {
        int sub = number1 - number2;
        return sub;
    }
    public static int addition(int number1,int number2) {
        int add = number1 + number2;
        return add;
    }
    public static int multiplication(int number1,int number2) {
        int mul = number1 * number2;
        return mul;
    }
    public static double division(int number1,int number2) {
        double div = (float) number1 / number2;
        return div;
    }
    double test(int number) {
        return number*number;
    }
}
