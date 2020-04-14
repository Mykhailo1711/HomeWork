public class AverageValue {
    public static void main(String[] args) {
        double sum =0;
double v=0;
        for (int i =0;i<args.length;i++) {


            double r = Double.parseDouble(args[i]);
            sum +=r;
            v = sum/args.length;
        }
        System.out.println(v);
    }

    }

