import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void sort(int[] numbers) {
        if (numbers.length == 2) {
            int temp = numbers[0];
            if (temp > numbers[1]) {
                numbers[0] = numbers[1];
                numbers[1] = temp;
            }
        } else if (numbers.length > 2) {
            int[] left = Arrays.copyOf(numbers, numbers.length / 2 + numbers.length % 2);
            int[] right = Arrays.copyOfRange(numbers, numbers.length / 2 + numbers.length % 2, numbers.length);
            sort(left);
            sort(right);
            int i = 0;
            int j = 0;
            int k = 0;
            while (i != left.length || j != right.length) {
                if (i == left.length) {
                    numbers[k] = right[j];
                    k++;
                    j++;
                } else if (j == right.length) {
                    numbers[k] = left[i];

                    k++;
                    i++;

                } else if (left[i] >= right[j]) {
                    numbers[k] = right[j];
                    k++;
                    j++;

                } else if (left[i] < right[j]) {
                    numbers[k] = left[i];
                    k++;
                    i++;
                }
            }
        }
    }


    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}