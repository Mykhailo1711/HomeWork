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
        System.out.println(finish - start);
        long start2= System.currentTimeMillis();
        LinkedList<Integer> secondList = new LinkedList<>();
        for (int a = 0; a <100_000 ; a++) {
            secondList.add(0,a);

        }
        long finish2 = System.currentTimeMillis();
        System.out.println(finish2 - start2);
    }
}
