package leetcode0509;
import java.util.*;
/*
 * For example:

Secret number:  "1807"
Friend's guess: "7810"
Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
Write a function to return a hint according to the secret number 
and friend's guess, use A to indicate the bulls and B to indicate the cows.
 In the above example, your function should return "1A3B".
 
 
 //还是时间问题 
  * 
  * 但是两种方式 时间几乎是一样的呜呜
  * 
  * 最后一种方式是简单正确的  嘿嘿嘿
 */
public class BullsCows {
public String getHint(String secret, String guess) {
        int length=secret.length();
        int bulls=0;
        int cows=0;
        Map<Character,Integer> mb = new HashMap<Character,Integer>();
        Map<Character,Integer> mc = new HashMap<Character,Integer>();
        for(int i=0;i<length;i++){
        	char b=secret.charAt(i);
        	char c=guess.charAt(i);
        	if(b==c){
        		bulls++;//位置正确 ++
        	}else{//位置不正确 用Hash存起来
        		if(mb.containsKey(b)){
        			int v = mb.get(b);
        			v++;
        			mb.put(b, v);
        		}else{
        			mb.put(b, 1);
        		}
        		//新建一个循环 
        		if(mc.containsKey(c)){
        			int v = mc.get(c);
        			v++;
        			mc.put(c, v);
        		}else{
        			mc.put(c, 1);
        		}
        	}
        }
        //涉及到哈希表的遍历  两种方式 
       //其实不用后面的遍历  
        	Set<Map.Entry<Character, Integer>> se=mb.entrySet();
        	Iterator it =se.iterator();
        	while(it.hasNext()){
        		Map.Entry<Character, Integer> mcc =(Map.Entry<Character, Integer>)it.next();
        		char c=mcc.getKey();
        		int val=mcc.getValue();
        		if(mc.containsKey(c)){
        			int vc=mc.get(c);
        			cows=cows+Math.min(val, vc);
        		}
        	}
       
        String s= new String(bulls+"A"+cows+"B");
        return s;
    }

public String getHint1(String secret, String guess) {
	int length=secret.length();
    int bulls=0;
    int cows=0;
    Map<Character,Integer> mb = new HashMap<Character,Integer>();
    for(int i=0;i<length;i++){
    	char b=secret.charAt(i);
    	char c=guess.charAt(i);
    	if(b==c){
    		bulls++;//位置正确 ++
    	}else{//位置不正确 用Hash存起来
    		if(mb.containsKey(b)){
    			int v = mb.get(b);
    			v++;
    			mb.put(b, v);
    		}else{
    			mb.put(b, 1);
    		}
    	}
    }
    //涉及到哈希表的遍历  两种方式 
    for(int i=0;i<length;i++){
    	char b=secret.charAt(i);
    	char c=guess.charAt(i);
    	if(b!=c){
    		if(mb.containsKey(c)){
    			int v=mb.get(c);
    			v--;
    			cows++;
    			if(v==0){
    				mb.remove(c);
    			}else{
    				mb.put(c, v);
    			}
    		}
    	}
    }
   
    String s= new String(bulls+"A"+cows+"B");
    return s;
}
public String getHint2(String secret, String guess) {
	int length = secret.length();
	 int bulls=0;
	    int cows=0;
	    int si[]=new int[10];
	    int gi[]= new int [10];
	for(int i=0;i<length;i++){
		char b=secret.charAt(i);
    	char c=guess.charAt(i);
    	if(b==c){
    		bulls++;//位置正确 ++
    	}else{
    		si[b-48]++;
    		gi[c-48]++;
    	}
	}
	for(int j=0;j<10;j++){
		cows=cows+Math.min(si[j], gi[j]);
	}
	 String s= new String(bulls+"A"+cows+"B");
     return s;
}
}
