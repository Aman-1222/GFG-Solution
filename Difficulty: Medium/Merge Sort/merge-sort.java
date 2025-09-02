class Solution {

    void merge(int arr[],int low, int mid, int high){
        int temp[]=new int[high-low+1];
        int right=mid+1;
        int left=low;
        int i=0;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]) {
                temp[i]=arr[left];
                left++;
            }
            else{
                temp[i]=arr[right];
                right++;
            }
            i++;
        }
        
        while(left<=mid){
            temp[i]=arr[left];
            left++;
            i++;
        }
        while(right<=high){
            temp[i]=arr[right];
            right++;
            i++;
        }
        
        for(int j=low;j<=high;j++){
            arr[j]=temp[j-low];
        }
    }
    
    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l==r) return;
        int mid= l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
        
    }
}