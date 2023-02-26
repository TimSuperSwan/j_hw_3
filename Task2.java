import java.util.ArrayList;

/*Пусть дан произвольный список целых чисел. Удалить из него чётные числа. */
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.add(2);
        numbers.add(7);
        numbers.add(8);

        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            // System.out.println(numbers.get(i));
            int a = numbers.get(i);
            if (a % 2 == 0) {
                numbers.remove(i);
                i -=1;
            }
        }
        System.out.println(numbers);

    }
}
