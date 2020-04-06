public class Factorial1 {
    static long Variable (int n){
        if (n ==1)
            return n;
            return Variable (n-1)*n;

    }
}
  class FactorialDemo {
    public static void main(String[] args) {
        for (int i = 5;i<=5; i++){
            System.out.println(i + "! = " + Factorial1.Variable(i));
        }
    }
}