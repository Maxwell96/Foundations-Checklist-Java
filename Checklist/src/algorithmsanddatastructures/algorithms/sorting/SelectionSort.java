package algorithmsanddatastructures.algorithms.sorting;

//Time complexity is O(n2)
//Space complexity is O(1) as the only extra memory used is for temporary variables while swapping two values in Array.
// The selection sort never makes more than O(N) swaps and can be useful when memory write is a costly operation.

public class SelectionSort {
    public static void selectionSort(int arr[]){

        // Get length of array
        int n = arr.length;

        // One by one move boundary of unsorted sub-array
        for(int i=0; i<n-1; i++){
            // Find the minimum element in unsorted array
            int min_idx = i;
            for(int j= i+1; j<n; j++){
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        //Printing the array
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};
        selectionSort(arr);
    }
}
