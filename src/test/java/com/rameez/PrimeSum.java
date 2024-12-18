package com.rameez;

import org.junit.Test;

import java.util.Arrays;

// https://www.interviewbit.com/problems/prime-sum/

public class PrimeSum {

    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 2; i <= A / 2; i++) {
            if (isPrime(i) && (isPrime(A - i))) {
                answer.add(i);
                answer.add(A - i);
                break;
            }
        }

        return answer;
    }

    public boolean isPrime(int A) {
        if (A == 1)
            return false;
        if (A == 2)
            return true;

        boolean answer = true;
        int limit = (int) Math.sqrt(A) + 1;
        for (int i = 2; i <= limit; i++) {
            if (A % i == 0) {
                answer = false;
                break;
            }
        }

        return answer;
    }

    @Test
    public void main() {
    }
}