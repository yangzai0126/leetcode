package leetcode;
import java.util.*;
/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

two  sum �������� ����Ƿ��� �±�  ʱ�临�ӶȽ�ΪO(n^2) ���ֻ���ҵ��������������ֵ ���������� Ȼ������ָ�� �ֱ��ǰ�ͺ���� ���ӶȽ�Ϊ�����ʱ�临�Ӷ�
 */
/*�����ù�ϣ������
 * 
 */
public class TwoSum {

/*public int[] twoSum(int[] nums, int target) {
        int [] re=new int[2];
        int flag=0;//������� ��û�� �������
        int length=nums.length;
        if(length<2){
        	return null; //û��ֱ�ӷ��ؿ�
        }else{
        	
        	for(int i=0;i<length-1;i++){
        		for(int j=i+1;j<length;j++){
        			if(nums[i]+nums[j]==target){
        				re[0]=i;
        				re[1]=j;
        				flag=1;
        			   break;
        		}
        	}
        		if(flag==1){
        			break;
        		}
        	}
        }
        if(flag==1){
        	return re;
        }else{
        	return null;
        }
        
    }
    */
	//2 Sum ������Կ����ù�ϣ����ʵ��
	//���ڷ���ֵ���±� �Ķ����Կ����ù�ϣ����ʵ��
public int[] twoSum(int[] nums, int target) {
	HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	int length=nums.length;
	int [] re=new int[2];
	for(int i=0;i<length;i++){
		if(hm.containsKey(target-nums[i])){
			
			re[0]=hm.get(target-nums[i]);
			re[1]=i;
			break;
		}else{
			hm.put(nums[i], i);
		}
	}
	return re;
	

}
}
