import java.util.Scanner;
public class PaswordVerification {
    public static void main(String[] args) {
        System.out.println("Please, enter your password (Passwords should be at least 8 characters long):");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        System.out.println("Please, repeat password:");
        String password1 = scanner.nextLine();
        int p = password.length();
if(p>=8 && (password.equals(password1))){
    System.out.print("Password is OK");

}else if(!password.equals(password1)) {
    System.out.println("Passwords should be the same!");
} else {
    System.out.println("Passwords should be at least 8 characters long");
}
        }

    }







