public class SwapElements {
    public static void main(String[] args) {
        int [] ints = new int[2];
        ints[0] = 10;
        ints [1] = 20;
        System.out.println("ints [0] =" + ints[0] );
        System.out.println("ints [1] =" +ints[1] );
        System.out.println("Made some magic operation:)");
        int x =0;
        x= ints [0];
        ints[0]=ints[1];
        ints [1]=x;
        System.out.println("now ints [0] =" + ints[0] );
        System.out.println("now ints [1] =" +ints[1] );



    }
}
