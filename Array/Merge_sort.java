import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    // Recursive Merge Sort function
    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(arr, start, mid);       // Sort left half
            mergeSort(arr, mid + 1, end);     // Sort right half

            merge(arr, start, mid, end);      // Merge the two halves
        }
    }

    // Merge two sorted halves
    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        // Merge elements into temp[]
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= end) temp[k++] = arr[j++];

        // Copy back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[start + x] = temp[x];
        }
    }
}
