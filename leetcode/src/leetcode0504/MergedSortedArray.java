package leetcode0504;
/*
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional 
elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
public class MergedSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int length=m+n;
		length--;
		m--;//注意这时候m已经减1
		for(int i=m;i>=0;){//把nums1中的变量后移到适当位置，最后一个位置为n+m-1
			nums1[length--]=nums1[i--];
		}
        int position1=n;//第一个数组的指针下标
        int position2=0;//第二个数组的指针下标
        int position=0;//最终的下标
        while((position1<n+m+1)&&position2<n){
        	if(nums1[position1]>nums2[position2]){
        		nums1[position++]=nums2[position2++];
        	}else{
        		nums1[position++]=nums1[position1++];
        	}
        }
        while(position2<n){
        	nums1[position++]=nums2[position2++];
        }
        //position1如果小于n+m 不用管
    }
}
