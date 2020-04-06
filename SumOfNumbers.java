import java.util.Scanner;
public class SumOfNumbers{
    public static void main (String args[ ]){
        System.out.println("Input first number, please");
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        System.out.println("Input second number, please");
        int b = scanner.nextInt();
        int c = a+b;
        System.out.println("Sum of your numbers = " +c );

    }
}