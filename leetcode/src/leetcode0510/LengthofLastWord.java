package leetcode0510;
/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.

��split()���� ʱ�临�Ӷ�̫��  
 ����������ʽ
 ������reverse
 ������ڱ����1MS
 */
public class LengthofLastWord {
	public static void main(String args[]){
		String s = " b  a  ";
		
		//String scs =s.trim();
		System.out.println(s);
		String ss[] = s.split("\\s+");
		for(int i=0;i<ss.length;i++){
			System.out.println(ss[i]);
		}
		
	}
public int lengthOfLastWord(String s) {
	   String scs = s.trim();
        String ss []=scs.split("\\s+");
        int length = ss.length;
        if(length==0){
        	return 0;
        }else{
        	return ss[length-1].length();
        }
    }
public int lengthOfLastWord1(String s) {
	int length=s.length();
	int rl = 0;
	int flag=0;
	for(int i=0;i<length;i++){
		if(Character.isLetter(s.charAt(i))){
			if(flag==0){
				rl++;		
				}else{
				rl=1;
				flag=0;//������ǰ��һ���ַ�
				}
		}else{
			flag=1;//������ǰǰһ���ǿո�
		}
	}
	return rl;
}
//ʹ��reverse
public int lengthOfLastWord2(String s) {
	//StringBuilder sb =new StringBuilder(s);
	int length=s.length();
	int rl = 0;
	int flag=1;
	for(int i=length-1;i>=0;i--){
		if(Character.isLetter(s.charAt(i))){
			if(flag==0){
				rl++;		
				}else{
				rl=1;
				flag=0;//������ǰ��һ���ַ�
				}
		}else{
			if(flag==0)
			break;
		}
	}
	return rl;
}
}
