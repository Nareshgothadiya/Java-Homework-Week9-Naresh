package calculate;

/*
1. Create one package with name calculate
2. Create two class with name “Calculator” and “Main”
3. Create four methods with manes “addition”, “subtraction”, “division”, and “multiplication”.
All methods are instance method and it doesn’t return anything. But it has two parameters with name “int a” and “int b”.
Also each method have System.out.println(). This prints the result.
Also create all one more method with name “calculateResult” with three parameter with name int a, int b and char symbol.
Write the logic in calculateResult method that when user enter first number and second number and symbol based on symbol it does calculate.
 */

import java.util.Scanner;

public class Calculator {

    public void addition(int a, int b) {
        System.out.println(a + b);
    }
    public void subtraction(int a, int b) {
        System.out.println(a - b);
    }
    public void multiplication(int a, int b) {
        System.out.println(a * b);
    }
    public void division(int a, int b) {
        System.out.println(a / b);
    }
    public void calculateResult(int a, int b, char option) {
        if (option == '+') {
            System.out.println("The Addition of two number is :" + (a + b));
        } else if (option == '-') {
            System.out.println("The Substraction of two number is :" + (a - b));
        } else if (option == '*') {
            System.out.println("The Multiplication of two number is :" + (a * b));
        } else if (option == '/') {
            System.out.println("The Division of two number is :" + (a / b));

        }
    }
}


