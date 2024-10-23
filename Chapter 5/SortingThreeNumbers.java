import java.util.Scanner;

public class SortingThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Sort the numbers in ascending order
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Print the sorted numbers in ascending order
        System.out.println("The numbers in ascending order are: " + num1 + " " + num2 + " " + num3);

        // Sort the numbers in descending order
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 < num3) {
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 < num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Print the sorted numbers in descending order
        System.out.println("The numbers in descending order are: " + num1 + " " + num2 + " " + num3);

    }
}
