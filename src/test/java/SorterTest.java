import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;


public class SorterTest {

    Sorter sorter = new Sorter();

    @Test
    public void sortTest() {
        List<Integer> unsortedList = new ArrayList<Integer>();
        List<Integer> sortedList = new ArrayList<Integer>();
        Collections.addAll(unsortedList, 6, 3, 4, 5);
        Collections.addAll(sortedList, 3, 4, 5, 6);

        sorter.sort(unsortedList);

        assertArrayEquals(sortedList.toArray(), unsortedList.toArray());
    }

}