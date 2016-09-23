package leetcode0511;
/*
 * Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.

Example 1:
Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
Return 16
The two words can be "abcw", "xtfn".

Example 2:
Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
Return 4
The two words can be "ab", "cd".

Example 3:
Given ["a", "aa", "aaa", "aaaa"]
Return 0
No such pair of words.
 */
public class MaximumProductofWordLengths {
	public static void main(String args[]){
	String words[]={"asd","fag","hfgj"};
	System.out.println(maxProduct(words));
}
public static int maxProduct(String[] words) {
	int length =words.length;
	int max=0;
	int midMax=0;
	int si[] =new int[length];
	int li[]=new  int[length];
	int midlength=0;
	for(int i=0;i<length;i++){
		midlength=words[i].length();
		si[i]=stringtoInteger(words[i],midlength);
		li[i]=midlength;
	}
		for(int i=0;i<length-1;i++)
			for(int j=i+1;j<length;j++){
				if((si[i]+si[j])==(si[i]|si[j])){
					midMax=li[i]*li[j];
					if(midMax>max){
						max=midMax;
					}
				}
			}
		return max;
        
    }
public static int stringtoInteger(String s, int length){
	int r=0;
	for(int i=0;i<length;i++){
		r=r|(1<<(s.charAt(i)-97));
	}
	return r;
}
}
