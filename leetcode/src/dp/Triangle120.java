package dp;

import java.util.*;
/*
 * 120. Triangle  QuestionEditorial Solution  My Submissions
Total Accepted: 78086
Total Submissions: 250059
Difficulty: Medium
Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

For example, given the following triangle
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 */

//该题的关键就是弄清 下标值 
public class Triangle120 {
	 public int minimumTotal(List<List<Integer>> triangle) {
	        int size=triangle.size();
	        if(size==0)
	        	return 0;
	        else if(size ==1)
	        	return triangle.get(0).get(0);
	        int min=Integer.MAX_VALUE;
	        int length=(size+1)*size/2;
	        int dp[]=new int[length];
	        dp[0]=triangle.get(0).get(0);
	        List<Integer> now=new LinkedList<Integer>();
	        for(int i=1;i<size;i++){
	        	now=triangle.get(i);
	        	for(int j=0;j<=i;j++){//主要是画图分析所在位置就可以
	        		int position=i*(i+1)/2+j;//当前点对应 dp的下标
	        		if(j==0)//在当前行最左边
	        			dp[position]=dp[position-i]+now.get(j);
	        		else if(j==i)//在当前行最右边
	        			dp[position]=dp[position-i-1]+now.get(j);
	        		else
	        			dp[position]=Math.min(dp[position-i], dp[position-i-1])+now.get(j);
	        			
	        	}
	        }
	        for(int i=0;i<size;i++)
	        {
	        	min=Math.min(min, dp[length-1-i]);
	        }
	        return min;
	    }
}
