import java.util.Scanner;
public class InputCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String text;

        do {
            System.out.println("Print text, please. Text will be input while you don't input exit ");
            text = scanner.nextLine();


        }while(!text.equalsIgnoreCase("exit"));
        System.out.println("You input " + text);
    }
}
