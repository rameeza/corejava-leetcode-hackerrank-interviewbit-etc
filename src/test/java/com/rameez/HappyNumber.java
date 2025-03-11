package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/happy-number/

class HappyNumber {

    // METHOD 1: I RAN THE LOOP 20 (RANDOMLY CHOSEN) TIMES MAX. IF IT DOESN'T REACH '1', IT IS NOT HAPPY.
    public boolean isHappy(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 4);
        map.put(3, 9);
        map.put(4, 16);
        map.put(5, 25);
        map.put(6, 36);
        map.put(7, 49);
        map.put(8, 64);
        map.put(9, 81);

        boolean ans = false;

        for (int i = 0; i <= 20; i++) {
            int newN = 0;
            while (n != 0) {
                newN += map.get(n % 10);
                n = n / 10;
            }
            if (newN == 1) {
                ans = true;
                break;
            } else {
                n = newN;
            }
        }
        return ans;
    }


    // METHOD 2: For single-digit numbers less than 10, only 1 and 7 can eventually lead to 1.
    public boolean isHappy2(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 4);
        map.put(3, 9);
        map.put(4, 16);
        map.put(5, 25);
        map.put(6, 36);
        map.put(7, 49);
        map.put(8, 64);
        map.put(9, 81);

        boolean ans = false;

        // for(int i=0; i<=20; i++){
        while (true) {
            int newN = 0;
            while (n != 0) {
                newN += map.get(n % 10);
                n = n / 10;
            }
            if (newN == 1 || newN == 7) {
                ans = true;
                break;
            } else if (newN < 10) {
                ans = false;
                break;
            } else {
                n = newN;
            }
        }
        return ans;
    }


    @Test
    void test() {

    }
}
