package leetcode0512;
/*
 * Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions
 at the same time (ie, you must sell the stock before you buy again).
 */
public class BestTimetoBuyandSellStockI {
public int maxProfit(int[] prices) {
	int account=0;
	int start=0;
	int length =prices.length;
	if(length<2){
		return 0;
	}
        for(int i=1;i<prices.length;i++){
        	if(prices[i]<prices[i-1]){
        		account+=prices[i-1]-prices[start];
        		start=i;
        	}
        }
        account+=prices[length-1]-prices[start];
        return account;
    }
}
