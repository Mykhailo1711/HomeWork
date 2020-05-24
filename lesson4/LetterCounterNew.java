public class LetterCounterNew {

    public static void main(String[] args) {
        String test = "This is a test text";
        int TCount = test.length() - test.replace("T", "").length();
        int hCount = test.length() - test.replace("h", "").length();
        int iCount = test.length() - test.replace("i", "").length();
        int sCount = test.length() - test.replace("s", "").length();
        int aCount = test.length() - test.replace("a", "").length();
        int tCount = test.length() - test.replace("t", "").length();
        int eCount = test.length() - test.replace("e", "").length();
        int xCount = test.length() - test.replace("x", "").length();
        System.out.println("Amount of letters are: "+" T - " +TCount+ " , " + "h - " + hCount +" , "
                +"i - "+iCount+" , "+"s - " +sCount+" , "
                + "a - "+aCount+" , "+"t - "+tCount+
                " , "+ "e - "+eCount+" , "+"x - "+xCount) ;



    }

}
