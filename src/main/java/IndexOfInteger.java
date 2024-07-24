import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> items = new ArrayList<>();
        String input;

        System.out.println("Enter integers (type an empty string to finish):");
        while (!(input = scanner.nextLine()).isEmpty()) {
            items.add(Integer.parseInt(input));
        }

        System.out.println("Enter a number to find its index in the list:");
        int number = Integer.parseInt(scanner.nextLine());

        int index = items.indexOf(number);
        if (index != -1) {
            System.out.println("The index of " + number + " is: " + index);
        } else {
            System.out.println(number + " is not in the list.");
        }
    }
}
