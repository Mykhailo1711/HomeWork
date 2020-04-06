import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {20, 43, 11, 16, 7,2,5,8,25};

        boolean isSorted = false;
        int forChange;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    forChange = array[i];
                    array[i] = array[i+1];
                    array[i+1] = forChange;
                }
            }
        }
        System.out.println(Arrays.toString(array);
    }

}
