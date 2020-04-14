public class MinNumber {
    public static void main(String[] args) {
        String min = args [0];

        for (int i =0;i<args.length;i++) {


            int r = Integer.parseInt(args[i]);
            int t = Integer.parseInt(min);
           if(r<t){

               t = r;
           }


        }
        System.out.println(min);
    }
}
