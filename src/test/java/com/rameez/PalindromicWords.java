package com.rameez;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/palindromic-words/

public class PalindromicWords {

    public int solve(String A) {

        int answer =0;

        // get words (String []) from a sentence (String).
        String [] words = A.split(" ");

        for (String word: words){
            if (isPalindrome(word)){
                answer++;
            }
        }

        return answer;
    }

    public boolean isPalindrome(String str){
        boolean answer = true;

        for (int i=0; i<=str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                answer=false;
                break;
            }
        }

        return answer;
    }


    @Test
    public void main() {
        assertEquals(solve("wow mom"), 2);
    }
}