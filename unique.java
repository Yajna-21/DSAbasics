class unique {
    public static void main(String[] args) {
        int A[] = {4, 2, 2, 5, 5};
        int unique = 0;

        for (int i = 0; i < A.length; i++) {
            unique = unique ^ A[i]; 
        }

        System.out.println(unique);
    }
}
