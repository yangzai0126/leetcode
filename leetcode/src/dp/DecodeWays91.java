package dp;
/*
 * 91. Decode Ways  QuestionEditorial Solution  My Submissions
Total Accepted: 79337
Total Submissions: 439338
Difficulty: Medium
A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.

For example,
Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

The number of ways decoding "12" is 2.
 */
public class DecodeWays91 {
public int numDecodings(String s) {
	//考虑情况要完全
        int length=s.length();
        if(length<1)   //字符串为空 返回0
        	return 0;
        int dp[]=new int[length+1];
        dp[0]=1;
        int start=Character.digit(s.charAt(0),10);//第一个字符为0 无法翻译  返回0
        if(start==0)
        	return 0;
        dp[1]=1;
        for(int i=2;i<=length;i++){
        	int front=Character.digit(s.charAt(i-2),10);
        	int now=Character.digit(s.charAt(i-1),10);
        	if(now==0) {   //如果当前值为0 必须和前面的匹配在一起
        		if(front==1||front==2)
        		dp[i]=dp[i-2];
        		else
        			return 0;//当前为0 前面不为1 或2 无法解析 返回0
        	}//当前值不为0
        	else if(front==1||(front==2&&now<7))//只有当前一个字符为1或者为2但当前字符小于7 与前一个字符才能组成一个解码
        		dp[i]=dp[i-1]+dp[i-2];
        	else
        		dp[i]=dp[i-1];
        }
        return dp[length];
        
    }
}
