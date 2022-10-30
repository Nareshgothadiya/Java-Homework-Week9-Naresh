package calculate;


import java.util.Scanner;
import java.util.concurrent.Callable;

/*
4. Write a “main” method into main class. It has scanner that takes user input.
Also write the logic that it ask user to “Enter first Number:”, “Enter second Number:”
“Please enter one of symbol +,-,*, /:” if user enter + symbol result like “Addition of 5 and 10 is: 15” and respective for other symbol.
5. With the result it’s also print one more message “Would you like to do more calculation
Please enter “Y” or “N” :” (Hint use while loop if user enter Y program asking the user to enter First Number,
and if user enter N programme should terminate)
 */
public class Main extends Calculator {

    public static void main(String[] args) {

        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int a = scanner.nextInt();
        System.out.println("Please enter first number : ");
        int b = scanner.nextInt();
        System.out.println("Please enter one of Synbol +,-,*,/ : ");
        char option = scanner.next().charAt(0);

        Calculator obj = new Calculator();
        obj.calculateResult(a, b, option);

        System.out.println("Would you like to do more calculation");
        char result = scanner.next().charAt(0);
        while (result == 'Y' || result == 'y') {
            System.out.println("Please enter first number : ");
            int a1 = scanner.nextInt();
            System.out.println("Please enter first number : ");
            int b1 = scanner.nextInt();
            System.out.println("Please enter one of Synbol +,-,*,/ : ");
            char option1 = scanner.next().charAt(0);

            Calculator obj1 = new Calculator();
            obj1.calculateResult(a1, b1, option1);
            break;
        }
    }

}

