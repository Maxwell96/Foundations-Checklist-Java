package algorithmsanddatastructures.algorithms.sorting;

//Time complexity is O(n2)
//Not suitable for sorting larger sized arrays

public class InsertionSort {
    public static void sortInsertion(int [] sort_arr){

        for(int i=0;i<sort_arr.length;++i){

            int j = i;

            while(j > 0 && sort_arr[j-1]>sort_arr[j]){

                int key = sort_arr[j];
                sort_arr[j] = sort_arr[j-1];
                sort_arr[j-1] = key;
                j = j-1;//j--

            }
        }
    }

    public static void main( String args[] ) {
        int [] arr = {5,2,12,12,1};
        sortInsertion(arr);

        for(int i=0;i<arr.length;++i){
            System.out.print(arr[i] + " ");
        }
    }
}
