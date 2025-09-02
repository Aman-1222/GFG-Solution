class Solution {

static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low ;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i<high)
                i++;
            while (arr[j] > pivot && j>low)
                j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }

    static void mergeSort(int arr[], int low, int high) {
        if (low >= high)
            return;

        int divide = partition(arr, low, high);
        mergeSort(arr, low, divide - 1);
        mergeSort(arr, divide + 1, high);

    }
}