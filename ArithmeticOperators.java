import java.util.Scanner;

public class ArithmeticOperators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        System.out.println("Enter B");
        int b = sc.nextInt();

        System.out.println("Adding A and B gives : " + (a + b));
        System.out.println("Subtracting A and B gives : " + (a - b));
        System.out.println("Multiplying A and B gives : " + (a * b));
        System.out.println("Dividing A and B gives : " + (a / b));
        System.out.println("Modulo of A and B gives : " + (a % b));

        sc.close();
    }
}