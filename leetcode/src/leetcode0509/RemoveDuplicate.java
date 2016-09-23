package leetcode0509;
/*
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.

Subscribe to see which companies asked this question
 */
public class RemoveDuplicate {
public int removeDuplicates(int[] nums) {
        int length =nums.length;
        if(length<=1){
        	return length;
        }else{
        	int before=nums[0];//��¼ǰһ��Ԫ�ص�ֵ
        	int duli=0;//��¼ĳ��Ԫ��ǰ�ظ��ĸ���
        	for(int i=1;i<length;i++){
        		if(nums[i]==before){
        			duli++;//
        		}else{
        			before=nums[i];
        			nums[i-duli]=nums[i];
        		}
        	}
        	return length-duli;
        	//ע�� ��������ظ����� û��ɾ�� Ҳû��Ҫ
        }
    }
}
