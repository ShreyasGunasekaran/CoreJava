import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        int maxRow = 5;
        int j = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int enteredNumber = scanner.nextInt();
        //printing the entered number in pyramid format
        for (int row = 1; row <= maxRow; row++, j = 1) {
            addSpace(row, maxRow);
            while (j <= (row * 2 - 1)) {
                System.out.print(enteredNumber);
                j++;
            }
            addSpace(row, maxRow);
            System.out.print("\n");
        }
    }

    public static void addSpace(int row, int maxRow) {
        for (int space = row; space < maxRow; space++) {
            System.out.print(" ");
        }
    }

}
