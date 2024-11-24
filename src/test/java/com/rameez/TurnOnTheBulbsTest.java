package com.rameez;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// https://www.interviewbit.com/problems/turn-on-the-bulbs/

public class TurnOnTheBulbsTest {

    int solve(int A) {
        Map<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("other", 2);

        int answer = (A / 6) * 2;

        if ((A % 6) == 1) {
            answer = answer + map.get("1");
        } else if ((A % 6) > 1) {
            answer = answer + map.get("other");
        }

        return answer;
    }

    @Test
    public void main() {
        assertEquals(solve(1), 1);
        assertEquals(solve(2), 2);
        assertEquals(solve(5), 2);
        assertEquals(solve(10), 4);
    }
}