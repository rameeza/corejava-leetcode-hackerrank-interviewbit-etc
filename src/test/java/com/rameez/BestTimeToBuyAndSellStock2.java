package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/


public class BestTimeToBuyAndSellStock2 {

    public int maxProfit(int[] prices) {
        boolean sold = true;
        int cp = prices[0];
        int answer = 0;

        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];
            // sell now
            if ((sold == false) && (currentPrice > cp)) {
                if ((i == prices.length - 1) || ((i < prices.length - 1) && (prices[i + 1] < currentPrice))) {
                    answer += (currentPrice - cp);
                    sold = true;
                }
            }
            // buy now
            if (sold == true) {
                if ((i != prices.length - 1) && (prices[i + 1] > currentPrice)) {
                    cp = currentPrice;
                    sold = false;
                }
            }
        }// end loop

        return answer;
    }

    @Test
    public void main() {

    }
}