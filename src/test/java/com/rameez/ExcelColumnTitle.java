package com.rameez;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/excel-column-title/

public class ExcelColumnTitle {

    public String convertToTitle(int A) {
        StringBuilder answer = new StringBuilder();

        while (A > 0) {
            // handle 'Z'
            if (A % 26 == 0) {
                answer.append('Z');
                A = (A - 1) / 26;
            } else {
                char c = (char) ('A' + ((A % 26) - 1));
                answer.append(c);
                A /= 26;
            }

        }

        return answer.reverse().toString();
    }

//    public String convertToTitle(int A) {
//        char[] array = new char[26];
//
//        for (int i = 0; i < 26; i++)
//            array[i] = (char) ('A' + i);
//
//        int num = 26;
//        int index;
//        String res = "";
//
//        while (A > 0) {
//            index = (A - 1 + num) % num;
//            //    index = (index - 1 + num) % num;
//            A = (A - 1) / num;
//            res = array[index] + res;
//        }
//
//        return res;
//
//    }

    @Test
    public void main() {
        assertEquals("BAQTZ", convertToTitle(943566));
    }
}