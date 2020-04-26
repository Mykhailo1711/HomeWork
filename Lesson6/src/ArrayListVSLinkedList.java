import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> firstList = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            firstList.add(0, i);

        }
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println(result);
        long start2 = System.currentTimeMillis();
        LinkedList<Integer> secondList = new LinkedList<>();
        for (int a = 0; a < 100_000; a++) {
            secondList.add(0, a);

        }
        long finish2 = System.currentTimeMillis();
        long result2 = finish2 - start2;
        System.out.println(result2);
        if (result > result2) {
            System.out.println("ArrayList is slower than LinkedList");
        } else {
            System.out.println("ArrayList is faster than LinkedList");

        }

        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            firstList.get(i);
        }
        long finish3 = System.currentTimeMillis();
        long result3 = finish3 - start3;
        System.out.println(result3);
        long start4 = System.currentTimeMillis();
        for (int a = 0; a < 100_000; a++) {
            secondList.get(a);
        }
        long finish4 = System.currentTimeMillis();
        long result4 = finish4 - start4;
        System.out.println(result4);
        if (result3 > result4) {
            System.out.println("ArrayList is slower than LinkedList");
        } else {
            System.out.println("ArrayList is faster than LinkedList");
        }
    }
}



