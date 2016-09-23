package leetcode0509;
import java.util.*;
/*
 * Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?

Subscribe to see which companies asked this question
 */
public class Pascaltwo {

public List<Integer> getRow(int rowIndex) {
        List<Integer> l = new ArrayList<Integer>();
        if(rowIndex < 0){
        	return l;
        }else{
        	int oldcache[] = new int[rowIndex+1];//上一层
        	int newcache[] = new int[rowIndex+1];//最新一层
        	oldcache[0]=1;
        	newcache[0]=1;
        	for(int i=1;i<=rowIndex;i++){
        		for(int k=1;k<i;k++){
        			oldcache[k]=newcache[k];
        		}
        		for(int j=1;j<i;j++){
        			newcache[j]=oldcache[j-1]+oldcache[j];//此时 cache [j-1]已经发生改变
        		}
        		newcache[i]=1;
        	}
        	for(int i=0;i<=rowIndex;i++){
        		l.add(newcache[i]);
        	}
        	return l;
        }
    }
}
