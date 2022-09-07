import java.util.ArrayList;
import java.util.List;

public class BubbleExample {

    public List<Integer> madeList(int sizeArr) {
        List<Integer> list = new ArrayList();
        for (long i = 0; i < sizeArr; i++) {
            list.add((int) Math.round((Math.random() * 100000) - 50000));
        }
        return list;
    }

    public void bubbleSorter(List<Integer> list) {
        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int i = 1; i < list.size(); i++) {
                int previous = list.get(i - 1);
                int current = list.get(i);
                if (previous > current) {
                    int temp = previous;
                    list.set(i - 1, current);
                    list.set(i, temp);
                    isSort = false;
                }
            }
        }
    }

    public void printer(List<Integer> list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
