import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> items = new ArrayList<>();
        String input;

        System.out.println("Enter integers (type an empty string to finish):");
        while (!(input = scanner.nextLine()).isEmpty()) {
            items.add(Integer.parseInt(input));
        }

        int sum = calculateSum(items);
        System.out.println("The sum of the list items is: " + sum);
    }

    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
