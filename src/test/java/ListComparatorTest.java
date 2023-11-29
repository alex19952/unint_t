import org.example.ListComparator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListComparatorTest {

    @Test
    public void testCompareAndPrint() {
        List<Double> list1 = List.of(1.0, 2.0, 3.0);
        List<Double> list2 = List.of(4.0, 5.0, 6.0);

        ListComparator listComparator = new ListComparator();
        listComparator.compareAndPrint(list1, list2);

    }

    @Test
    public void testCalculateAverage() {
        List<Double> list = List.of(1.0, 2.0, 3.0);

        ListComparator listComparator = new ListComparator();
        double average = listComparator.calculateAverage(list);

        assertEquals(2.0, average, 0.001); // Проверка на равенство с погрешностью
    }
}

