package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/trapping-rain-water

public class TrappingRainWater {

    public int trap(int[] height) {
        int[] maxHeightAfter = new int[height.length];
        int maxHeight = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            maxHeightAfter[i] = maxHeight;
            if (height[i] > maxHeight) {
                maxHeight = height[i];
            }
        }

        int[] maxHeightBefore = new int[height.length];
        maxHeight = 0;
        for (int i = 0; i < height.length; i++) {
            maxHeightBefore[i] = maxHeight;
            if (height[i] > maxHeight) {
                maxHeight = height[i];
            }
        }

        //
        int answer = 0;
        for (int i = 0; i < height.length; i++) {
            int topLevelOfWater = Math.min(maxHeightBefore[i], maxHeightAfter[i]);
            if (height[i] < topLevelOfWater) {
                answer += topLevelOfWater - height[i];
            }
        }

        return answer;
    }

    @Test
    public void main() {

    }
}