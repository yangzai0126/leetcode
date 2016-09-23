package leetcode0510;
/*
 * Given an array of integers, every element appears three times except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Subscribe to see which companies asked this question
 */
public class SingleNumbert {

public int singleNumber1(int[] nums) {
    int ans = 0;
    for(int i = 0; i < 32; i++) {
        int sum = 0;
        for(int j = 0; j < nums.length; j++) {
            if(((nums[j] >> i) & 1) == 1) {
                sum++;//统计每一位1的个数
            }
        } 
        sum %= 3;
        if(sum != 0) {
            ans |= sum << i;
        }
    }
    return ans;
}
}
