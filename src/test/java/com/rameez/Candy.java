package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/candy/

public class Candy {

    public int candy(int[] ratings) {
        if (ratings.length == 1) {
            return 1;
        }

        int[] give = new int[ratings.length];

        // give 1 candy to each
        for (int i = 0; i < give.length; i++) {
            give[i] = 1;
        }

        int noOfChanges = 1;
        while (noOfChanges != 0) {
            noOfChanges = 0;
            for (int i = 0; i < give.length; i++) {
                if (i == 0) {
                    if ((ratings[i] > ratings[i + 1]) && (give[i] <= give[i + 1])) {
                        give[i] = give[i + 1] + 1;
                        noOfChanges++;
                    }

                } else if (i == give.length - 1) {
                    if ((ratings[i] > ratings[i - 1]) && (give[i] <= give[i - 1])) {
                        give[i] = give[i - 1] + 1;
                        noOfChanges++;
                    }
                } else {
                    if ((ratings[i] > ratings[i - 1]) && (give[i] <= give[i - 1])) {
                        give[i] = give[i - 1] + 1;
                        noOfChanges++;
                    }
                    if ((ratings[i] > ratings[i + 1]) && (give[i] <= give[i + 1])) {
                        give[i] = give[i + 1] + 1;
                        noOfChanges++;
                    }
                }
            }

        }

        int answer = 0;
        for (int i = 0; i < give.length; i++) {
            answer += give[i];
        }
        return answer;
    }


    @Test
    public void main() {

    }
}