package leetcode;
import java.util.*;
public class VerifyPreorder {

public boolean isValidSerialization(String preorder) {
        
	String s[]=preorder.split(",");
	Stack<String> st=new Stack<String>();
	for(int i=0;i<s.length;i++){
		if(s[i].equals("#")){
			while(st.size()>=2&&st.peek().equals("#")){
			st.pop();
			st.pop();
			}
			if(!st.isEmpty()){
				st.push("#");
			}else{
				if(i==s.length-1){
					return true;
				}else{
					return false;
				}
			}
		}else{
		st.push(s[i]);
		}
	}
	if(st.isEmpty()){
		return true;
	}else{
	return false;
	}
    }
}
