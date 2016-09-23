package leetcode0510;
import java.util.*;
/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

Subscribe to see which companies asked this question

���� �������twopointerҲ��ʵ��
 */
public class ValidParentheses {
	 public boolean isValid(String s) {
		 int length = s.length();
		 Stack<Character> sc = new Stack<Character>();
		 for(int i=0;i<length;i++){
			 char c= s.charAt(i);
			 if(c=='('||c=='{'||c=='['){
				 sc.push(c);
			 }else{//����������
				 if(sc.isEmpty()){//ջΪ�� ����false
					 return false;
				 }else{
					 if(c-sc.peek()<3){//������ƥ�� ����
						 sc.pop();
					 }else{//�����Ų�ƥ��  ����false
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
