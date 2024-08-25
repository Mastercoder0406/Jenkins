import java.util.Scanner;

public class prac {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter another number: ");
    int num2 = scanner.nextInt();

    int sum = num1 + num2;

    System.out.println("The sum is: " + sum);
  }
}