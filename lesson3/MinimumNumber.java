public class MinimumNumber {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;

        for (int i =0;i<args.length;i++) {


            int r = Integer.parseInt(args[i]);
            min = Math.min(min, r);
        }
        System.out.println(min);
    }
}

