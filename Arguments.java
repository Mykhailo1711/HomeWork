public class Arguments {
    public static void main(String[] args) {
        int randomNum = ((int) (Math.random() * 5) + 1);
        int i;

        for (String s : args) {

            if (s.equals("help") ) {
                System.out.println("текст");
                break;
            }
        }
    }

}