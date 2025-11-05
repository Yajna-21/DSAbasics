class binarysearch{
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,8,9};
        int target=5;
        int left=0;
        int right=A.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(A[mid]==target){
                System.out.println("Element found at index: "+mid);
                return;
            }
            else if(A[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
       
    }
}