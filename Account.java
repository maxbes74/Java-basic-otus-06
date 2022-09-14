import java.util.*;

public class Account {
    public Set<String> madeSetAccount() {
        Set<String> set = new HashSet<>();
        return set;
    }

    public void printerSet(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}








