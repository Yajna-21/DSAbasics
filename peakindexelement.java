class peakindexelement {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1; 
            } else {
                high = mid; 
            }
        }
        
        return low;
    }

    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 0};
        peakindexelement s = new peakindexelement();
        System.out.println( s.peakIndexInMountainArray(arr));
    }
}
