public class LetterCounter {
    public static void main(String[] args) {
        String test = "This is a test text";
        int occurrencesCount = test.length() - test.replace("T", "").length();
        System.out.println(occurrencesCount);

    }
}
