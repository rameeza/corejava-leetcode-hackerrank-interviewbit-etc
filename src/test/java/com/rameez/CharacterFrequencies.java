package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/convert-to-palindrome/

public class CharacterFrequencies {

    public ArrayList<Integer> solve(String A) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < A.length(); i++) {
            Character c = A.charAt(i);

            if (map.containsKey(c)) {
                int count = map.get(c);
                map.replace(c, count + 1);
            }else{
                map.put(c, 1);
            }
        }

        // this ArrayList maintains the order of the values in 'map'.
        return new ArrayList<>(map.values());
    }

    @Test
    public void main() {
        assertEquals(1, solve("epyyevdadveyype"));
    }
}