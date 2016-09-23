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

//����Ĺؼ�����Ū�� �±�ֵ 
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
	        	for(int j=0;j<=i;j++){//��Ҫ�ǻ�ͼ��������λ�þͿ���
	        		int position=i*(i+1)/2+j;//��ǰ���Ӧ dp���±�
	        		if(j==0)//�ڵ�ǰ�������
	        			dp[position]=dp[position-i]+now.get(j);
	        		else if(j==i)//�ڵ�ǰ�����ұ�
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
