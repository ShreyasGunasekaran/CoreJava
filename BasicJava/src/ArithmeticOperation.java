public class ArithmeticOperation {
    public static void main(String[] args) {
        int a = 3, b = 4;
        int c;
        c = a + b + a++ + b++ + ++a + b;
        // 3 + 4 + 3 (a=4) + 4 (b=5) + 5 + 5 = 24
        System.out.println("Integer value of a = " + a);
        System.out.println("Integer value of b = " + b);
        System.out.println("The Final result is " + c);
    }
}
