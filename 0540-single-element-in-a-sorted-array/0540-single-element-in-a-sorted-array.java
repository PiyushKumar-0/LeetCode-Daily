class Solution {
    public int singleNonDuplicate(int[] arr) {
        int st=0;   int end=arr.length-1;
        if(arr.length==1)  return arr[0];
        while(st<=end){
            int mid=st+(end-st)/2;
            if(mid==0 && arr[0]!=arr[1])  return arr[mid];
            if(mid==arr.length-1  && arr[arr.length-1]!=arr[arr.length-2])  return arr[mid];
            if(arr[mid-1]!=arr[mid]  &&  arr[mid+1]!=arr[mid]){
                return arr[mid];
            }
            if(mid%2==0){
                if(arr[mid-1]==arr[mid]){
                    end=mid-1;
                }
                else{
                    st=mid+1;
            }
        }else{
            if(arr[mid-1]==arr[mid]){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
       
    }
     return -1;
}
}