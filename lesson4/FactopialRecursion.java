public  class FactopialRecursion {

    static int Fact ( int n){
            if (n == 1) {
                return 1;
            } else
                return n * Fact(n - 1);
        }

    public static void main(String[] args) {
        int t =5;
        System.out.println(t +"! = " + Fact (t));
    }
    }
