package leetcode;
/*
 * You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

Example 1:
coins = [1, 2, 5], amount = 11
return 3 (11 = 5 + 5 + 1)

Example 2:
coins = [2], amount = 3
return -1.


public class Solution {  
    public int coinChange(int[] coins, int amount) {  
        int dp[] = new int[amount + 1];  
        final int INF = 0x7ffffffe;  
        for (int i = 1; i <= amount; i++) dp[i] = INF;  
        for (int i = 0; i <= amount; i++) {  
            for (int j = 0; j < coins.length; j++) {  
                if (i + coins[j] <= amount)  
                    dp[i + coins[j]] = Math.min(dp[i + coins[j]], dp[i] + 1);  
            }  
        }  
        return dp[amount] == INF ? -1 : dp[amount];  
    }  
}  
 */
import java.util.*;

public class CoinChange {

public int coinChange(int[] coins, int amount) {
	if(amount<1){//Ǯ��С��1����-1
		return 0;
	}
	int length=coins.length;
	if(length<1){//�������С��1 ����-1
		return -1;
	}
      Arrays.sort(coins);//���������
      int dp[]=new int[amount+1];//��̬�滮 �洢ÿһ��amount��Ӧ�Ĵ���
      dp[0]=0;
      for(int i=1;i<=amount;i++){//��ʼ����ÿһ��dp����ܴ��ֵ 
    	  dp[i]=Integer.MAX_VALUE-1;
      }
      for(int i=1;i<=amount;i++){
    	  if(i>=coins[length-1]){
    		  int lin[]=new int[length];
    		  for(int j=0;j<length;j++){
        		  lin[j]=dp[i-coins[j]]+1;
        	  }
        	  Arrays.sort(lin);
        	  if(lin[0]==Integer.MAX_VALUE){
        		  dp[i]=Integer.MAX_VALUE-1;
        	  }else{
        		  dp[i]=lin[0];
        	  }
    	  }
    	  else{
    	  int position=coinPosition(coins,i);
    	  if(position==0){//Ǯ��̫�� û����
    		  dp[i]=Integer.MAX_VALUE-1;
    	  }else{
    	  int lin[]=new int[position];
    	  for(int j=0;j<position;j++){
    		  lin[j]=dp[i-coins[j]]+1;
    	  }
    	  Arrays.sort(lin);
    	  if(lin[0]==Integer.MAX_VALUE){
    		  dp[i]=Integer.MAX_VALUE-1;
    	  }else{
    		  dp[i]=lin[0];
    	  }
    	  }
    	  }
      }
      if(dp[amount]>Integer.MAX_VALUE-2){
    	  return -1;
      }else{
	return dp[amount];
      }
    }


public int coinPosition(int []coins,int amount){//���ؿ��Զһ���Ǯ�ҵķ�Χ������i
	int length=coins.length;//length���ڵ���1
	int i=0;
	while(i<length&&coins[i]<=amount){
		i++;
	}
	
	return i;//���ص�һ������amount��λ��
	
}
  
}
