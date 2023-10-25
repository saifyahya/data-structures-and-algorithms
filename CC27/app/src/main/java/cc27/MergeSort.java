package CC27.app.src.main.java.cc27;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n > 1) {
            int mid = n / 2;
            int[] left = new int[mid];
            int[] right = new int[n - mid];
            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, n - mid);

            mergeSort(left);
            mergeSort(right);
            merge(left, right, arr);
        }
    }

    private static void merge(int[]left,int[]right,int[]arr){
        int i=0, j=0 , k=0;
        while(i< left.length && j<right.length){
            if(left[i] <= right[j]){
                arr[k]=left[i];
                i++;
            }
            else {
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public  static void mergeSort(int[]arr, int[]temp, int low, int high){
        if(low<high){
            int mid = low+(high-low)/2;
            mergeSort(arr,temp,low,mid);
            mergeSort(arr,temp,mid+1,high);
            merge(arr, temp, low, high, mid);
        }
    }
    private static void merge(int[]arr,int[]temp,int low,int high, int mid){
        for(int i=low; i<=high; i++){
            temp[i]=arr[i];
        }
        int i=low, j=mid+1, k=low;
        while(i<=mid && j<=high){
            if(temp[i]<=temp[j])
                arr[k++]=temp[i++];
            else
                arr[k++]=temp[j++];
        }
        while(i<=mid){
            arr[k++]=temp[i++];
        }
    }
}
