import java.util.HashMap;

public class Duplicate {
    public static int findDuplicate(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {
            // Check if number already exists in the map
            if (map.containsKey(num)) {
                System.out.println("Duplicate found: " + num);
                return num; // Return the first duplicate
            } else {
                map.put(num, true);
            }
        }

        System.out.println("No duplicate found");
        return -1; // No duplicates found
    }

    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 2, 5, 1, 3};
        System.out.println("First duplicate: " + findDuplicate(numbers));
    }
}
