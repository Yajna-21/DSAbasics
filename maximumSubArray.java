class maximumSubArray{
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int maxSum=-999;
        for(int i=0;i<nums.length;i++){
            int currentSum=0;
            for(int j=i;j<nums.length;j++){
                currentSum+=nums[j];
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println(maxSum);        
    }
}