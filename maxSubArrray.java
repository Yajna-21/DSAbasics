class maxSubArrray{
    public int maxArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            sum += num;
            maxSum = (maxSum >= sum) ? maxSum : sum;

            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxSum);
        return maxSum;
}
public static void main(String[] args) {
    maxSubArrray sol = new maxSubArrray();
    int nums[]={-2,1,-3,4,-1,2,1,-5,4};
    sol.maxArray(nums);
}
}