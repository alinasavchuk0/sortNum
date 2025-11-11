import java.until.Arrays;
import java.until.Collections; 

public class SortDescending {
    public static void main(String[] args)  {
        Integer[] numbers = {5, 2, 9, 1, 3} ;

        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println("Сортування за спаданням:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}