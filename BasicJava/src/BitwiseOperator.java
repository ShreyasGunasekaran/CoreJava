import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int enteredIntegerNumber = scanner.nextInt();

        //Negation, Left, Right & Right with zerofill shifts
        System.out.println("The Negation of the number " + enteredIntegerNumber + " is " + ~enteredIntegerNumber);
        System.out.println("The Left Shift of the number " + enteredIntegerNumber + " by one is " + (enteredIntegerNumber >> 1));
        System.out.println("The Right Shift of the number " + enteredIntegerNumber + " by one is " + (enteredIntegerNumber << 1));
        System.out.println("The Right Shift with zero fill of the number " + enteredIntegerNumber + " by one is " + (enteredIntegerNumber >>> 1));

        System.out.println("Please enter the second number to perform logical operation");
        int enteredDoubleNumber = scanner.nextInt();
        int result = 0;
        result = enteredIntegerNumber & enteredDoubleNumber;
        System.out.println("Result of " + enteredIntegerNumber + " & " + enteredDoubleNumber + " is " + result);
        result = enteredIntegerNumber | enteredDoubleNumber;
        System.out.println("Result of " + enteredIntegerNumber + " | " + enteredDoubleNumber + " is " + result);
    }
}
