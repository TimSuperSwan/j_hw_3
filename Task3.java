import java.util.ArrayList;
import java.util.Arrays;

/*Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее арифметичское этого списка. */

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(89,2,3,44,5,6,7,8,9,10));
        System.out.println(numbers);

        int minValue = numbers.get(0);
        int maxValue = numbers.get(0);
        int arithmMean = 0;

        for (Integer number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
            if (number < minValue) {
                minValue = number;
            }
            arithmMean += number;
        }

        double answer = (double)arithmMean / numbers.size();
    
        System.out.printf("минимальное значение: %d , максимальное значение: %d,\nсреднее арифметическое: %.1f", minValue, maxValue, answer);
    }
}
