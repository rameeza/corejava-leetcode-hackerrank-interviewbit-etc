package com.rameez;

import org.junit.Test;

import java.util.Arrays;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int buyOn = 0;
        int sellOn = 0;
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[buyOn]) {
                buyOn = i;
            } else if (prices[i] - prices[buyOn] > profit) {
                sellOn = i;
                profit = prices[i] - prices[buyOn];
            }
        }

        return profit;
    }

    @Test
    public void main() {
    }
}