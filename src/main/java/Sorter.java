import java.util.List;

public class Sorter {
    public void sort(List<Integer> items) {
        for (int i = 0; i < items.size(); i++) {
            for (int j = i; j < items.size(); j++) {
                if (items.get(i) > items.get(j)) {
                    items.set(i, items.get(i) + items.get(j));
                    items.set(j, items.get(i) - items.get(j));
                    items.set(i, items.get(i) - items.get(j));
                }
            }
        }
    }
}
