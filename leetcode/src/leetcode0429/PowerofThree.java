package leetcode0429;
/*
 * Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?

//����� ����ѭ�� �е��ѶȰ�
 */
public class PowerofThree {

public boolean isPowerOfThree(int n) {
        if(n<=0){
        	return false;
        }
        while((n/3)!=0&&(n%3)==0){
        	n=n/3;
        }
        if(n==1){
        	return true;
        }else{
        	return false;
        }
    }
}
