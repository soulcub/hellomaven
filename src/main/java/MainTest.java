import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {

    public void testBasicSort() {

        Sorter sorter = new Sorter();
        List<Integer> items = new ArrayList<Integer>();
        Collections.addAll(items, 4, 2, 8, 9);

        sorter.sort(items);

        List<Integer> sortedItems = new ArrayList<Integer>();
        Collections.addAll(sortedItems, 2, 4, 8, 9);
        if (!items.equals(sortedItems)) {
            throw new RuntimeException("Collections are not equal");
        }

        System.out.println("Success!");
    }

    public void testSortingOfTenItems() {

        Sorter sorter = new Sorter();
        List<Integer> items = new ArrayList<Integer>();
        Collections.addAll(items, 4, 2, 8, 9, 23, 4, 6, 7, 4, 3);

        sorter.sort(items);

        List<Integer> sortedItems = new ArrayList<Integer>();
        Collections.addAll(sortedItems, 2, 3, 4, 4, 4, 6, 7, 8, 9, 23);
        if (!items.equals(sortedItems)) {
            throw new RuntimeException("Collections are not equal");
        }

        System.out.println("Success!");
    }

    public void testSortingOfEmptyList() {

        Sorter sorter = new Sorter();
        List<Integer> items = new ArrayList<Integer>();

        sorter.sort(items);

        List<Integer> sortedItems = new ArrayList<Integer>();
        if (!items.equals(sortedItems)) {
            throw new RuntimeException("Collections are not equal");
        }

        System.out.println("Success!");
    }



}
