package com.rameez;

// https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArray {

    /**
     * Removes duplicates from a sorted array list and returns the size of the modified list.
     *
     * This method takes a sorted ArrayList of Integers as input, removes any duplicate elements,
     * and returns the size of the ArrayList after duplicates have been removed.
     *
     * @param a the sorted array list from which duplicates are to be removed.
     * @return the size of the array list after removing duplicates.
     */
    static int removeDuplicates(ArrayList<Integer> a) {
        // Use Java Streams to process the list 'a'.
        // The 'distinct()' method ensures that only unique elements are retained.
        a = a.stream()
                .distinct() // Removes duplicates by retaining only distinct elements
                // Collect the distinct elements back into a new ArrayList
                .collect(Collectors.toCollection(ArrayList::new));

        // Return the size of the ArrayList after duplicates have been removed.
        return a.size();
    }


    public static void main(String[] args) {
        ArrayList<Integer> a;

        Integer[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        a = Arrays.stream(arr).collect(Collectors.toCollection(ArrayList::new));

        System.out.println(a);
        removeDuplicates(a);

    }
}
