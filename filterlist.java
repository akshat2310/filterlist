import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class filterlist {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(23,34, 56, 89, 11, 13, 17, 52, 23, 29);
        IntSummaryStatistics stats = prices.stream() .mapToInt((x) -> x) .summaryStatistics();

        System.out.println("Highest price number in List : " + stats.getMax());
        System.out.println("Lowest price number in List : " + stats.getMin());
        System.out.println("Sum of all price numbers : " + stats.getSum());
        System.out.println("Average of all prices : " + stats.getAverage());
    }

    }

