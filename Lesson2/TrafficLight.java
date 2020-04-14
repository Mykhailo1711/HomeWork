import java.util.Scanner;
public class TrafficLight {
    public static void main(String[] args) {
        System.out.println("What colour of traffic light? (colour of light should be input by capital letters)!");
        Scanner scanner = new Scanner(System.in);
        String signal = scanner.nextLine();
String signal1 = signal.toUpperCase();
        switch (signal1){
            case "GREEN" :
                System.out.println("GO!");
                break;
            case "RED":
                System.out.println("STOP!");
                break;
            case "YELLOW":
                System.out.println("STOP!");
                break;
            case "YELLOW AND RED":
                System.out.println("GET READY TO GO!");
                break;
            default:
                System.out.println("Colour of light should be input by capital letters!");

        }
    }
}
