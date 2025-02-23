package review.oop.lists;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.*;
import static org.junit.jupiter.api.Assertions.*;

class ArrayListExamplesTest {

    @Test
    void defaultNoArgConstructorTest() {
        List<String> list = new ArrayList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    void constructorWithInitialCapacityTest() {
        List<Integer> list = new ArrayList<>(3);
        assertEquals(0, list.size());
    }

    @Test
    void constructorWithCollectionTest() {
        Collection<Integer> numbers = IntStream.range(0,10).boxed().collect(toSet());

        List<Integer> list = new ArrayList<>(numbers);
        assertEquals(10, list.size());
        assertTrue(numbers.containsAll(list));
    }

    @Test
    void addElementsToListTest() {
        List<Long> list = new ArrayList<>();

        list.add(1L);
        list.add(2L);
        list.add(1, 3L);

        assertEquals(Arrays.asList(1L, 3L, 2L), list);
    }

    @Test
    void addCollectionsToListTest() {
        List<Long> list = new ArrayList<>(Arrays.asList(1L, 2L, 3L));
        LongStream.range(4, 10).boxed()
                .collect(collectingAndThen(toCollection(ArrayList::new),
                        ys -> list.addAll(0, ys)));

        assertEquals(Arrays.asList(4L, 5L, 6L, 7L, 8L, 9L, 1L, 2L, 3L), list);
    }

    @Test
    void iterateOverTheArrayListTest() {
        List<Integer> list = new ArrayList<>(
                IntStream.range(0, 10)
                        .boxed()
                        .collect(toCollection(ArrayList::new))
        );

        ListIterator<Integer> it = list.listIterator(list.size());
        List<Integer> result = new ArrayList<>(list.size());
        while (it.hasPrevious()) {
            result.add(it.previous());
        }

        Collections.reverse(list);
        assertEquals(result, list);
    }
}