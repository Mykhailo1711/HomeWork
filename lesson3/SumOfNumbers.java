

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum =0;

        for (int i =0;i<args.length;i++) {


            int r = Integer.parseInt(args[i]);
            sum += r;
        }
        System.out.println(sum);
    }
}
