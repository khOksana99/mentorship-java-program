import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new Random().ints(50, -10, 100).toArray();
        List<String> cities = Arrays.asList("Anapa", "Anapa", "Anapa", "Denwer", "Hwana", "Lviv", "Lviv", "Kyiv", "Kyiv", "London", "Kemer");
        List<Data> dataList = Arrays.asList(new Data(Arrays.asList(new Node(0, "Alex"), new Node(1, "Sergio"))), new Data(Arrays.asList(new Node(45, "Gio"))), new Data(Arrays.asList(new Node(10, "Yoram"), new Node(12, "Jakub"), new Node(6, "Jason"))));
        JavaStreamApi javaStreamApi = new JavaStreamApi();

        javaStreamApi.getMinNumber(array);
        javaStreamApi.getMaxNumber(array);
        javaStreamApi.getAverageNumber(array);
        javaStreamApi.getMinFromFirstThree(array);
        javaStreamApi.getFilterAndSortDescArray(array);
        javaStreamApi.getMapOfCities(cities);
        javaStreamApi.getMapNameIndex(dataList);
        javaStreamApi.getListOfIndexes(dataList);
    }
}
