package leetcode0509;
import java.util.*;
/*
 * Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
//本题也说明了用list的好处 ，我们可以利用上一个list的值来计算本次的 通过get方法
 */
public class PascalTriangle {
public List<List<Integer>> generate(int numRows) {
	List<List<Integer>> ll =new ArrayList<List<Integer>>();
        if(numRows<=0){
        	return ll;
        }else{
        	for(int i=0;i<numRows;i++){
        	List<Integer> l = new ArrayList<Integer>();
        	l.add(1);//初始化最左边是1
        	ll.add(l);
        	}
        	//初始化
        	for(int i=1;i<numRows;i++){
        		for(int j=1;j<i;j++){
        			ll.get(i).add(ll.get(i-1).get(j-1)+ll.get(i-1).get(j));
        		}
        		ll.get(i).add(1);//最右边是1
        	}
        	return ll;
        }
    }
}
