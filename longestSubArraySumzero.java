import java.util.*;

public class longestSubArraySumzero{

    public static int longestZeroSumSubarray(int[] arr) {
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        int maxLength = 0;
        int cumulativeSum = 0;

        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];

            if (cumulativeSum == 0) {
                maxLength = i + 1;
            } else if (sumIndexMap.containsKey(cumulativeSum)) {
                int prevIndex = sumIndexMap.get(cumulativeSum);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                sumIndexMap.put(cumulativeSum, i);
            }
        }

        return maxLength;

        
    }

    public static void main(String[] args) {
        int[] arr = {2,15,-2,-10,1,-1,2,-5,3};

        System.out.println(longestZeroSumSubarray(arr));
    }
}