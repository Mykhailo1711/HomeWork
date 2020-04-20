import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3,6,8,9,12,4,7,2,14};
        for (int a = 0; a <array.length ; a++) {
            int min = a;
            for(int b = a; b < array.length; b++){
                if(array[b]<array[min]){
                    min =b;
                }
            }
            swap(array,a,min);
        }
        System.out.println(Arrays.toString(array));
    }
    static void swap(int [] array, int a, int min){
       int c = array[a];
       array[a] = array[min];
       array[min]=c;
    }
}
