class Solution {
    public void nextPermutation(int[] A) {
        int pivot=-1; int n=A.length;
        for(int i=n-2; i>=0; i--){
            if(A[i]<A[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            reverse(A,0,n-1);
            return;
        }
        for(int i=n-1;i>pivot;i--){
            if(A[i]>A[pivot]){
                swap(A,i,pivot);
                break;
            }
        }
            reverse(A,pivot+1,n-1);
        }
        private void swap(int[]A,int i,int j){
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
        }
        private void reverse(int[]A,int start,int end){
            while(start<end){
                swap(A,start,end);
                start++;
                end--;
        }
    }
}
