import java.util.Scanner;
public class DiscountCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide item price, please");
        double price = scanner.nextDouble();
        System.out.println("Input customer age, please");
        int age = scanner.nextInt();

            if (age < 6) {
                double discount = 0.8;
                double discountedPrice = price - price * discount;
                System.out.println("new price = " + discountedPrice);
            }else if (age > 65) {
                double discount = 0.3;
                double discountedPrice = price - price * discount;
                System.out.println("new price = " + discountedPrice);
            }else if(age<18) {
                double discount = 0.25;
                double discountedPrice = price - price * discount;
                System.out.println("new price = " + discountedPrice);
            } else {
                System.out.println("No discount!");
            }

    }
}
