class Solution {

    void mergeSort(int arr[], int l, int r) {
    if(l<r){
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr , l , mid,r);
    }
        
    }
    public void merge(int[] arr , int l , int mid , int r){
        int[] res = new int[r-l+1];
        int i= l , j=mid+1 , k=0;
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                res[k++]=arr[i++];
            }
            else{
                res[k++]=arr[j++];
            }
        }
        while(i<=mid){
            res[k++]=arr[i++];
        }
        while(j<=r){
            res[k++]=arr[j++];
        }
        for(int a=0;a<res.length;a++){
            arr[a+l]=res[a];
        }
       // return arr;
    }
}
