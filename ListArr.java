import java.util.ArrayList;
import java.util.List;

public class ListArr {
    private int count;

    public ListArr(int count) {
        this.count = count;
    }

    public void makeList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add((int) Math.round((Math.random() * 100) - 50));
        }
        System.out.println(list);

    }
}



