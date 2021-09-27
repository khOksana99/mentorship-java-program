import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamTests {
    private JavaStreamApi javaStreamApi = new JavaStreamApi();
    private int[] array;
    List<String> cities;
    List<Data> dataList;

    @BeforeClass
    public void setUp() {
        array = new int[]{1, 50, 578, 7, 957, 24, 75, 33, 47, 7, 75, 33, 24};
        cities = Arrays.asList("Anapa", "Anapa", "Anapa", "Denwer", "Hwana", "Lviv", "Lviv", "Kyiv", "Kyiv", "London", "Kemer");
        dataList = Arrays.asList(new Data(Arrays.asList(new Node(0, "Alex"), new Node(1, "Alex"))), new Data(Arrays.asList(new Node(45, "Alex"))), new Data(Arrays.asList(new Node(10, "Yoram"), new Node(12, "Yoram"), new Node(6, "Jason"))));
    }

    @Test
    public void getMinTest() {
        Integer expected = 1;
        Integer actual = javaStreamApi.getMinNumber(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMaxTest() {
        Integer expected = 957;
        Integer actual = javaStreamApi.getMaxNumber(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageTest() {
        Double expected = 147.0;
        Double actual = javaStreamApi.getAverageNumber(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFilterAndSortDescArrayTest() {
        int[] expected = new int[]{50, 47, 33, 33};
        int[] actual = javaStreamApi.getFilterAndSortDescArray(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMinFromFirstThreeTest() {
        Integer expected = 1;
        Integer actual = javaStreamApi.getMinFromFirstThree(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMapOfCitiesTest() {
        Map<String, Long> expected = new HashMap<>();
        expected.put("KEMER", 1L);
        expected.put("HWANA", 1L);
        expected.put("ANAPA", 3L);
        Map<String, Long> actual = javaStreamApi.getMapOfCities(cities);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMapNameIndexTest() {
        Map<String, List<Integer>> expected = new HashMap<>();
        expected.put("Alex", Arrays.asList(0, 1, 45));
        expected.put("Yoram", Arrays.asList(10, 12));
        expected.put("Jason", Arrays.asList(6));
        Map<String, List<Integer>> actual = javaStreamApi.getMapNameIndex(dataList);
        Assert.assertEquals(expected, actual);
    }
}
