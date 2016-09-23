package leetcode0503;
/*152. Maximum Product Subarray
 * */
 
public class MaxProduct {

	public int maxProduct(int[] nums) {
		return 0;
	}
	public int maxaddSubArray(int[] nums) {
        int length=nums.length;
        int max=nums[0];
        int first=0;
        int last=0;
        int nowmax=nums[0];
        for(int i=1;i<length;i++){
        	if(nowmax<0){//更新新的起点
        		first=i;
        		nowmax=nums[i];
        	}else{
        		nowmax+=nums[i];
        	}
        	if(nowmax>max){
        		max=nowmax;
        		last=i;
        	}
        	
        }
	return max;
    }
	
	//减法
	public int maxMinusArray(int[] nums) {
        int length=nums.length;
        int max=nums[0];
        int first=0;
        int last=0;
        int mid=0;
        int nowmax=nums[0];
        for(int i=1;i<length;i++){
        	mid=nowmax-nums[i];
        	if(nums[i]>0){
        		if(nowmax<0||mid<nums[i]){//更新新的起点
        		first=i;
        		nowmax=nums[i];
        	}
        	}
        	else{
        		nowmax-=nums[i];
        	}
        	if(nowmax>max){
        		max=nowmax;
        		last=i;
        	}
        	
        }
	return max;
    }
}
