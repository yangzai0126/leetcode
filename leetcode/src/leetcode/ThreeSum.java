package leetcode;
import java.util.*;

/*
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:
Elements in a triplet (a,b,c) must be in non-descending order. (ie, a �� b �� c)
The solution set must not contain duplicate triplets.

two  sum 
����ʱ�临�Ӷ� O��nlgn��
����ʱ�临�Ӷ�O(n^2)
Ҳ������ȫ����  O(n^3)
 */
public class ThreeSum {

public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ll =new ArrayList<List<Integer>>();
        int length=nums.length;
        if(length<3){
        	return ll;
        }
        
        Arrays.sort(nums);
        for(int i=0;i<length-2;i++){
     	int j=i+1;
        	int p=length-1;
        	while(j<p){
        		int count=nums[i]+nums[j]+nums[p];
        	if(count==0){
        		if(i>0&&nums[i]==nums[i-1]){//������������ǰ�������ȣ�����һ���ظ�
        			break;
        		}
        		List<Integer> l = new ArrayList<Integer>();
        		l.add(nums[i]);
        		l.add(nums[j]);
        		l.add(nums[p]);
        		ll.add(l);
        		j++;//��Ӻ� j����
        		p--;//pǰ��
        			while(j<p&&nums[j]==nums[j-1]){//��ʱi�̶���jҪ�Ǻ�ǰ���һ�� �����϶��ڼ����� ���Ժ���
        				j++;
        			}
        			while(j<p&&nums[p]==nums[p+1]){//ͬ��
        				p--;
        			}
        	}else{
        		if(count<0){//С��0 
        			j++;
        		}else{
        			p--;
        		}
        	}
        	}
        	
        }
        return ll;
    }

}
