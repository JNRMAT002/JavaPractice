import java.util.Scanner;

public class DumbCalculator {
    public static void main(String[] args) {
        float operandOne, operandTwo = 0;
        float output = 0;
        String operator;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter operand one: ");
        operandOne = keyboard.nextInt();
        System.out.println("Enter operand two: ");
        operandTwo = keyboard.nextInt();

        System.out.println("Enter operation you want performed: ");
        operator = keyboard.next();

        keyboard.close();

        switch (operator) {
            case "+":
                output = (operandOne + operandTwo);
                break;

            case "-":
                output = (operandOne - operandTwo);
                break;

            case "*":
                output = (operandOne * operandTwo);
                break;

            case "/":
                output = (operandOne / operandTwo);
                break;
        
            default:
                output = (operandOne + operandTwo);
                break;
        }

        System.out.println("Output of operation: " + output);
    }
}
