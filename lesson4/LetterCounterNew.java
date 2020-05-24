public class LetterCounterNew {
    public static void main(String[] args) {
        String test = "This is a test text";
        int TCount = test.length() - test.replace("T", "").length();
        System.out.println("Amount of letter T is: "+TCount);
        int hCount = test.length() - test.replace("h", "").length();
        System.out.println("Amount of letter h is: "+hCount);
        int iCount = test.length() - test.replace("i", "").length();
        System.out.println("Amount of letter i is: "+iCount);
        int sCount = test.length() - test.replace("s", "").length();
        System.out.println("Amount of letter s is: "+sCount);
        int aCount = test.length() - test.replace("a", "").length();
        System.out.println("Amount of letter a is: "+aCount);
        int tCount = test.length() - test.replace("t", "").length();
        System.out.println("Amount of letter t is: "+tCount);
        int eCount = test.length() - test.replace("e", "").length();
        System.out.println("Amount of letter e is: "+eCount);
        int xCount = test.length() - test.replace("x", "").length();
        System.out.println("Amount of letter x is: "+xCount);



    }

}
