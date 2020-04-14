class Bird{
    private static int kilometers;
    private int km;
    public void flight(int km){
        this.km += km;
        kilometers += km;
    }
    public static int getKilometers(){
        return kilometers;
    }

    public int getKm() {
        return km;
    }
}
 class BirdTester{
    public static void main(String[] args) {
        Bird falcon = new Bird();
        Bird owl = new Bird();
        Bird parrot = new Bird();
        falcon.flight(10);
        owl.flight(20);
        parrot.flight(30);
        System.out.println(owl.getKm() + " " + owl.getKilometers());
    }
}