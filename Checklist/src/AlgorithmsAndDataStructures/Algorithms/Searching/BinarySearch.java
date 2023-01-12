package AlgorithmsAndDataStructures.Algorithms.Searching;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static boolean binarySearch(ArrayList<Integer> list, int target){

        //Sort the list
        Collections.sort(list);
        int first = 0;
        int last = list.size()-1;

        //find the middle
        while(first < last){

            int mid = (first + last)/2;

            if(list.get(mid).equals(target)){
                System.out.println("Target "+target+" found at index "+mid);
                return true;
            }
            else if(target > list.get(mid)){
                first = mid+1;
            }
            else last = mid;
        }
        System.out.println("Target not found in list provided!");
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(6);
        myList.add(5);
        myList.add(12);
        myList.add(21);
        myList.add(2);
        binarySearch(myList, 5);
    }
}
