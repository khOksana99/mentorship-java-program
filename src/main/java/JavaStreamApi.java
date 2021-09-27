import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class JavaStreamApi {
    /**
     * #1  min
     */
    public int getMinNumber(int[] array) {
        return Arrays.stream(array)
                .min()
                .getAsInt();
    }

    /**
     * #2  max
     */
    public int getMaxNumber(int[] array) {
        return Arrays.stream(array)
                .max()
                .getAsInt();
    }

    /**
     * #3
     * average
     */
    public double getAverageNumber(int[] array) {
        return Arrays.stream(array)
                .average()
                .getAsDouble();
    }

    /**
     * #4
     * filter from 30 to 55 and sort DESC
     */
    public int[] getFilterAndSortDescArray(int[] array) {
        return Arrays.stream(array)
                .filter(number -> number >= 30 && number <= 55)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
    }

    /**
     * #5
     * remove all duplicates, square and get min from first three numbers
     */

    public int getMinFromFirstThree(int[] array) {
        return Arrays.stream(array)
                .distinct()
                .map(i -> i * i)
                .limit(3)
                .min()
                .getAsInt();
    }

    /**
     * #6
     * get Map of cities (key - city, value - count of city)
     */
    public Map<String, Long> getMapOfCities(List<String> list) {
        return list.stream()
                .filter(i -> !i.startsWith("D"))
                .map(i -> i.toUpperCase())
                .sorted()
                .limit(5)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    /**
     * #7
     */
    public Map<String, List<Integer>> getMapNameIndex(List<Data> list) {
        return list.stream()
                .map(Data::getNodeList)
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Node::getName, Collectors.mapping(Node::getIndex, toList())));
    }
}
