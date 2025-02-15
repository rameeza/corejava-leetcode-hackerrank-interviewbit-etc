package com.rameez;

import java.util.Stack;

// https://leetcode.com/problems/asteroid-collision/

class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            int a = asteroids[i];
            boolean bothEqualAndOpposite = false;
            // collision happens if they are of opposite sign
            while (stack.size() > 0 && stack.get(stack.size() - 1) > 0 && a < 0) {
                int popped = stack.pop();
                if (Math.abs(a) == Math.abs(popped)) {
                    bothEqualAndOpposite = true;
                    break;
                }

                a = Math.abs(a) > Math.abs(popped) ? a : popped;
            }
            if (bothEqualAndOpposite) {
                continue;
            } else {
                stack.add(a);
            }
        }
        if (stack.size() == 0) {
            return new int[stack.size()];
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }
}
