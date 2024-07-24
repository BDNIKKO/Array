import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        String input;

        System.out.println("Enter items (type an empty string to finish):");
        while (!(input = scanner.nextLine()).isEmpty()) {
            items.add(input);
        }

        if (items.size() >= 5) {
            System.out.println("The fifth item in the list is: " + items.get(4));
        } else {
            System.out.println("There are less than 5 items in the list.");
        }
    }
}
