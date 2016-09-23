package leetcode0503;
/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
//判断一个字符串是否是回文 ，忽略大小写 和只考虑字符和数字
 */
public class ValidPalindrome {

public boolean isPalindrome(String s) {
	String ss=s.toUpperCase();
	int length=ss.length();
	if(length==0){
		return true;
	}
	char cc[]=new char[length];
	int count=0;
	for(int i=0;i<length;i++){
		if(Character.isUpperCase(ss.charAt(i))||Character.isDigit(ss.charAt(i))){
			cc[count++]=ss.charAt(i);
		}
			
	}
	count--;
	if(count<0){
		return true;
	}
	int first=0;
	while(first<count){
		if(cc[first++]!=cc[count--]){
			return false;
		}
	}
	if(first>=count){
		return true;
	}else{
		return false;
	}
	
        
    }
public boolean isPalindrome1(String s){
	String ss=s.toUpperCase();
	int length=ss.length();
	if(length==0){
		return true;
	}
	//while()
	return false;
}
}
