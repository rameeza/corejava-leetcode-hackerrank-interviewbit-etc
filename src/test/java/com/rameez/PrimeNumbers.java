package com.rameez;

import org.junit.Test;

import java.util.ArrayList;

// https://www.interviewbit.com/problems/prime-numbers/

public class PrimeNumbers {

    public ArrayList<Integer> sieve(int A) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 2; i <= A; i++) {
            if (isPrime(i)) {
                answer.add(i);
            }
        }

        return answer;
    }


    public boolean isPrime(int inp) {
        if (inp == 2) {
            return true;
        }

        boolean answer = true;
        int limit = inp - 1;

        for (int i = 2; i <= limit; i++) {
            if (inp % i == 0) {
                answer = false;
                break;
            } else {
                limit = (inp / i) + 1;
            }
        }
        return answer;
    }

    @Test
    public void main() {
    }
}