package AlgorithmsAndDataStructures.Algorithms.Searching;

import java.util.ArrayList;

public class LinearSearch {

    public static boolean linearSearch(ArrayList<Integer> list, int target){
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == target){
                System.out.println("Target ("+target+") found at position "+i);
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
        linearSearch(myList, 5);
    }
}
