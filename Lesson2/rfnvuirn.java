import java.lang.Math;
public class rfnvuirn {
    public static void main(String[] args) {
       String [] s = {"Green","Red","Yellow","Yellow and Red"};
       int s1 = s.length;
        int signal = (int) (Math.random() * s1);
        switch (signal){
            case 1:
                System.out.println("Go!");
                break;
            case 2:
                System.out.println("Stop!");
                break;
            case 3:
                System.out.println("Stop!");
                break;
            case 4:
                System.out.println("Get ready to go!");
                break;
            default:
                System.out.println("Colour of light should be input by capital letters!");

        }

    }
}
