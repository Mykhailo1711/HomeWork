public class BeerTester {
    public static void main(String[] args) {
Beer beer = new Beer("Lech","white",1,1);
int hashCode = beer.hashCode();


Beer beer1 = new Beer("Zubr","Strong",2,2);
int hashCode1 = beer1.hashCode();

System.out.println(beer.equals(beer1));

    }
}
