import java.util.Scanner;
public class Weather {
    public static void main(String[] args) {
        System.out.println("Is it rain? yes or no?");
        Scanner scanner = new Scanner(System.in);
        String rain = scanner.nextLine();
        if ("yes".equalsIgnoreCase(rain)) {
            System.out.println("Do not forget umbrella!");
        } else if("no".equalsIgnoreCase(rain)) {
            System.out.println("Leave umbrella at home.");
        }else {
            System.out.println("You must answer yes or no");
        }

    }
}