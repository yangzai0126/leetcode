package leetcode0503;
/*
 * Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Subscribe to see which companies asked this question
//此题画图就可以说明情况
 */
public class SellStock {

public int maxProfit(int[] prices) {
	
	int length=prices.length;
	int profit[]=new int[length];//记录与前一天相比的收益
	for(int i=1;i<length;i++){
		profit[i]=prices[i]-prices[i-1];
	}
	int first=0;//first 和last返回买卖时间
	int last=0;
	int maxprofit=0;
	int nowprofit=0;
	for(int i=1;i<length;i++){
		nowprofit+=profit[i];//当前收益等于前一天收益
		if(nowprofit>maxprofit){
			maxprofit=nowprofit;
			last=i;
		}
		if(nowprofit<0){
			first=i;//更新买入时间
			nowprofit=0;//买入后更新当前收益
			
		}
	}
        return maxprofit;
    }
}
