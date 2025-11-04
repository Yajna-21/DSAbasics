class occur {
    public static void main(String[] args) {
        int A[]={4,2,1,5,5};
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if(A[i]==A[j] && i!=j){
                    System.out.println(A[i]);
                   return;
                }
            }
        }
    }

    }
