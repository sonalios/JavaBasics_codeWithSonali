import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // declaring varibales
        double num1 , num2;
        double result;
        // Creating scanner for object to get the input
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("==============================================");
            System.out.println("1. + for ADDITION");
            System.out.println("2. - for SUBTRACTION");
            System.out.println("3. * for MULTIPLICATION");
            System.out.println("5. 4. / for DIVISION");
            System.out.println("6. % for REMAINDER");
            System.out.println("7. ^ for POWER");
            System.out.println("8. Q for QUIT");
            System.out.println("==============================================");

            // ask the user to enter first number
            System.out.println("Enter your first number:\n");
            num1 = scanner.nextDouble();
            // ask the user to enter second number
            System.out.println("Enter your second number:\n");
            num2 = scanner.nextDouble();

            System.out.println("Enter an operators like (+, -, *, /, %, ^) only:\n ");
            // storing the operator in char object
            char operator = scanner.next().charAt(0);

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

                case '%':
                    result = num1 % num2;
                    break;

                case '^':
                    result = Math.pow(num1, num2);
                    break;

                case 'Q':
                    System.exit(0);

                default:
                    System.out.println("Please enter specified operator only");
                    return;
            }
            System.out.println(num1 + " " + operator + " " + num2 + " is : " + result);
        } while (result != 'Q');
        scanner.close();
    }
}
