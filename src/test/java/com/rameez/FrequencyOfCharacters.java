package com.rameez;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/string-inversion/

public class FrequencyOfCharacters {


    public ArrayList<Integer> solve(String A) {
        // Integer [] arr = new Integer[26] initializes all 26 to null
        // int[] arr = new int[26] initializes all 26 to 0
        int[] arr = new int[26];

        for (int i = 0; i < A.length(); i++) {
            // 0 for 'a', 1 for 'b',...
            int index = (int) (A.charAt(i) - 'a');
            arr[index] = arr[index] + 1;
        }

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
        }

        return answer;
    }

    @Test
    public void main() {
        solve("abcdefghijklasdmnopqrstuvwxyz");
    }
}