package com.rameez;

import org.junit.Test;

import java.util.ArrayList;

// https://www.interviewbit.com/problems/nearest-smaller-element/

public class NearestSmallerElement {

    /**
     * For each element in the input list, finds the nearest smaller element to the left.
     * <p>
     * This method takes an ArrayList of integers as input and returns a new ArrayList
     * where each element is replaced by the nearest smaller element to its left.
     * If no such element exists, it is replaced by -1.
     *
     * @param A the input ArrayList of integers
     * @return an ArrayList of integers where each element is the nearest smaller element
     * to the left in the original list, or -1 if no such element exists
     */
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> answer = new ArrayList<>();

        // If the input list has at least one element, initialize the first element as -1
        if (A.size() >= 1) {
            answer.add(-1);
        }

        // Variable to store the nearest smaller element
        int nearestSmall = -1;

        // Iterate over the elements of the list starting from the second element
        for (int i = 1; i < A.size(); i++) {

            // If the current element is smaller than or equal to the previous element and the previous element has no element greater than it to its left.
            if ((A.get(i - 1) >= A.get(i)) && (answer.get(i - 1) == -1)) {
                answer.add(-1);
                continue;
            }

            nearestSmall = -1;
            for (int j = i; j >= 0; j--) {
                if (A.get(j) < A.get(i)) {
                    nearestSmall = A.get(j);
                    break;
                }
            }
            answer.add(nearestSmall);
        }

        return answer;
    }

    @Test
    public void main() {

    }
}