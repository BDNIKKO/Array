import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        String input;

        System.out.println("Enter items (type an empty string to finish):");
        while (!(input = scanner.nextLine()).isEmpty()) {
            items.add(input);
        }

        if (!items.isEmpty()) {
            System.out.println("The last item in the list is: " + items.get(items.size() - 1));
        } else {
            System.out.println("The list is empty.");
        }
    }
}
