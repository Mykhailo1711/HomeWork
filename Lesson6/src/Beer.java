public class Beer {
    String name;
    String type;
    int alcoholAmount;
    int volume;

    public Beer(String name, String type, int alcoholAmount, int volume) {
        this.name = name;
        this.type = type;
        this.alcoholAmount = alcoholAmount;
     this.volume = volume;
    }

    @Override
    public boolean equals(Object another) {
        if (another == null) {
            return false;
        }
        if (this == another) {
            return true;
        }
        if (!(another instanceof Beer)) {
            return false;
        }
        Beer anotherBeer = (Beer) another;
        if (this.name != anotherBeer.name) {
            return false;
        }
        if (this.type != anotherBeer.type) {
            return false;
        }
        if (this.alcoholAmount != anotherBeer.alcoholAmount) {
            return false;
        }
        if (this.volume != anotherBeer.volume) {
            return false;
        }
return true;

    }

    @Override
    public int hashCode() {
      int result = alcoholAmount + volume;
      return result;
    }
}