package leetcode0503;
/*
 * Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Subscribe to see which companies asked this question
//���⻭ͼ�Ϳ���˵�����
 */
public class SellStock {

public int maxProfit(int[] prices) {
	
	int length=prices.length;
	int profit[]=new int[length];//��¼��ǰһ����ȵ�����
	for(int i=1;i<length;i++){
		profit[i]=prices[i]-prices[i-1];
	}
	int first=0;//first ��last��������ʱ��
	int last=0;
	int maxprofit=0;
	int nowprofit=0;
	for(int i=1;i<length;i++){
		nowprofit+=profit[i];//��ǰ�������ǰһ������
		if(nowprofit>maxprofit){
			maxprofit=nowprofit;
			last=i;
		}
		if(nowprofit<0){
			first=i;//��������ʱ��
			nowprofit=0;//�������µ�ǰ����
			
		}
	}
        return maxprofit;
    }
}
