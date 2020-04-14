import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        System.out.println("Sides of triagle should be < 0");
        System.out.print("Input first side of triangle, a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("Input second side of triangle, b = ");
        double b = scanner.nextDouble();
        System.out.print("Input third side of triangle, c = ");
        double c = scanner.nextDouble();

        if ( (c < (a+b))&&(b <  (c+a))&&(a < (c+b))){
            System.out.println("It is possible to build a triangle with this sides!");
        }else  {
            System.out.println("It is impossible to build a triangle with this sides");
        }

    }
}
