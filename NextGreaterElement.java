import java.util.*;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> s = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // Pop smaller or equal elements
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            // If stack not empty, top is next greater
            if (!s.isEmpty()) {
                ans[i] = s.peek();
            }

            // Push current element
            s.push(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] ans = nextGreaterElement(arr);

        System.out.print("Next Greater Elements: ");
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}