import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        BubbleExample bubbleExample = new BubbleExample();
        List<Integer> list = bubbleExample.madeList(100);
        List<Integer> list2 = bubbleExample.madeList(100);
//        bubbleExample.printer(list);

        long startTimeSort = System.currentTimeMillis();
        bubbleExample.bubbleSorter(list);
        long endTimeSort = System.currentTimeMillis();
//        bubbleExample.printer(list);
        System.out.println("Сортировка пузырьком : " + (endTimeSort - startTimeSort) + " мл.сек");

        long startTimeSort2 = System.currentTimeMillis();
        Collections.sort(list2);
        long endTimeSort2 = System.currentTimeMillis();
//        bubbleExample.printer(list);
        System.out.println("Сортировка Collections.sort : " + (endTimeSort2 - startTimeSort2) + " мл.сек");
    }
}
