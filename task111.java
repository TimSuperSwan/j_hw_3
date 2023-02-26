
import java.util.ArrayList;
import java.util.Arrays;

public class task111 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 3, 68, 21, 74, 3, 1, 5));

        System.out.println(sort(numbers, 0, numbers.size() - 1));
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> numbers, int firstIndex, int lastIndex) {
        ArrayList<Integer> result = new ArrayList<>();

        if (firstIndex != lastIndex) {

            ArrayList<Integer> leftArray = new ArrayList<>();
            for (int i = 0; i < (lastIndex + 1) / 2; i++) {
                leftArray.add(numbers.get(i));

            }
            System.out.print("В списке ");
            System.out.print(numbers);
            System.out.print(" левая:");
            System.out.print(leftArray);

            ArrayList<Integer> rightArray = new ArrayList<>();
            for (int i = (lastIndex + 1) / 2; i < numbers.size(); i++) {
                rightArray.add(numbers.get(i));
            }
            System.out.print(" правая:");
            System.out.println(rightArray);
           

            if (leftArray.get(firstIndex) > rightArray.get(firstIndex)) {
                result.addAll(sort(rightArray, firstIndex, rightArray.size() - 1));
                result.addAll(sort(leftArray, firstIndex, leftArray.size() - 1));
                System.out.println(result);
                return result;
            } else {
                result.addAll(sort(leftArray, 0, leftArray.size() - 1));
                result.addAll(sort(rightArray, 0, rightArray.size() - 1));
                System.out.println(result);
                return result;
            }

        }

        return numbers;

    }

}
