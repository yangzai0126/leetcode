package leetcode0510;
import java.util.*;
/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

Subscribe to see which companies asked this question

这题 用数组和twopointer也可实现
 */
public class ValidParentheses {
	 public boolean isValid(String s) {
		 int length = s.length();
		 Stack<Character> sc = new Stack<Character>();
		 for(int i=0;i<length;i++){
			 char c= s.charAt(i);
			 if(c=='('||c=='{'||c=='['){
				 sc.push(c);
			 }else{//遇到右括号
				 if(sc.isEmpty()){//栈为空 返回false
					 return false;
				 }else{
					 if(c-sc.peek()<3){//左括号匹配 弹出
						 sc.pop();
					 }else{//左括号不匹配  返回false
						 return false;
					 }
				 }
			 }
		 }
		 if(sc.isEmpty()){
			 return true;
		 }else{
			 return false;
		 }
	        
	    }
}
