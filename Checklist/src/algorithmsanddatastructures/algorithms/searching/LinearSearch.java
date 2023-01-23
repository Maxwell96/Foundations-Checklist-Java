package algorithmsanddatastructures.algorithms.searching;

import java.util.ArrayList;

//Linear search has a time complexity of O(n)
//Space complexity is O(1) as there is no extra memory used is for temporary variables while looping through the Array.


public class LinearSearch {

    public static boolean linearSearch(ArrayList<Integer> list, int target){
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == target){
                System.out.println("Target ("+target+") found at index "+i);
                return true;
            }
        }
        System.out.println("Target not found in provided list!");
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
        linearSearch(myList, 0);
    }
}
