package com.rameez;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/guess-number-higher-or-lower/

public class GuessNumberHigherOrLower {

    private int pickedNo=1702766719;

    public int guessNumber(int n) {
        int answer=0;
        int l=1, r=n;

        while(true){
            if (guess(l) == 0){
                return l;
            }

            if (guess(r) == 0){
                return r;
            }

            int mid=(int)(((long)l+r)/2);
            int guessMid = guess(mid);
            if (guessMid == 0){
                return mid;
            }

            if (guessMid == -1){
                r=mid;
            }else if (guessMid == 1){
                l=mid;
            }
        }// loop ends
    }

    private int guess(int num) {
        if (num == pickedNo){
            return 0;
        } else if (num < pickedNo) {
            return 1;
        }else{
            return -1;
        }
    }

    @Test
    public void main() {
        assertEquals(guessNumber(2126753390), 1702766719);
    }
}