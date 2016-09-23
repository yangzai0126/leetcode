package string;
/*
 * 5. Longest Palindromic Substring  QuestionEditorial Solution  My Submissions
Total Accepted: 124536
Total Submissions: 524725
Difficulty: Medium
Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 */
//用的动态规划 可是时间复杂度太高  我们可以优化
public class LongestPalindromicSubstring5 {
public String longestPalindrome(String s) {
        int length=s.length();
        int start=0;
        int max=1;
        boolean flag2=true;
        if(length<1)
        	return null;
        char c[]=s.toCharArray();
        boolean flag[][]=new boolean[length][length];
        boolean lf[]=new boolean[length+1];//加入这一项时间复杂度 降低了一些 可以避免一些没必要的判断
        lf[1]=true;
        flag[0][0]=true;
        for(int i=1;i<length;i++){
        	flag[i][i]=true;
        	if(c[i]==c[i-1]){
        		flag[i-1][i]=true;
        		if(lf[2]==false){
    				lf[2]=true;
    			}
        		if(flag2){
        			max=2;
        			start=i-1;
        			flag2=false;
        		}
        		
        	}
        }
        for(int le=3;le<=length;le++)//回文长度
        	if(lf[le-2]){
        	for(int j=0;j<=length-le;j++){//start dian 
        		if(c[j]==c[j+le-1]&&flag[j+1][j+le-2]){
        			flag[j][j+le-1]=true;
        			if(lf[le]==false){
        				lf[le]=true;
        			}
        			if(le>max){
        				max=le;
        				start=j;
        			}
        		}
        	}
        	}
        if(start+max==length)
        	return s.substring(start);
        else
        return s.substring(start,start+max);
    }
}
