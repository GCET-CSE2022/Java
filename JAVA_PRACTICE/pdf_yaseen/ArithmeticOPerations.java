import java.util.Scanner;

public class ArithmeticOPerations { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First no: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter Second no: "); 
        double num2 = scanner.nextDouble();

        System.out.println("Ek operation chunein: + ke liye ek dabayein, - ke liye do dabayein, * ke liye teen dabayein, / ke liye chaar dabayein");
        int operation = scanner.nextInt();
        double result;

        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose 1, 2, 3, or 4.");
                break; 
            }

        scanner.close();
    }
}
