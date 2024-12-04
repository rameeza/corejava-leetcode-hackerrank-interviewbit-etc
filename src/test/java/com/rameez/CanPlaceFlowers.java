package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/can-place-flowers/

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int countOfInsertablePositions = 0;
        int firstIndexOf1 = flowerbed.length;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                firstIndexOf1 = i;
                break;
            }
        }

        // 1 is not present in the array
        if (firstIndexOf1 == flowerbed.length) {
            int count = (flowerbed.length + 1) / 2;
            return count >= n;
        } else {
            countOfInsertablePositions = firstIndexOf1 / 2;
        }


        int gapCount = 0;

        int lastIndexOf1 = flowerbed.length;
        for (int i = flowerbed.length - 1; i >= 0; i--) {
            if (flowerbed[i] == 1) {
                lastIndexOf1 = i;
                break;
            }
        }
        for (int i = firstIndexOf1; i <= lastIndexOf1; i++) {
            if (flowerbed[i] == 0) {
                gapCount++;
                if (gapCount == 3) {
                    gapCount = 1;
                    countOfInsertablePositions++;
                }
            } else {
                gapCount = 0;
            }
        }

        // no of continuous 0s at the end.
        int lastWidthOf0s = flowerbed.length - lastIndexOf1 - 1;
        countOfInsertablePositions += (lastWidthOf0s / 2);

        return (countOfInsertablePositions >= n);
    }

    @Test
    public void main() {
    }
}