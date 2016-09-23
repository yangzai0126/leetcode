package leetcode0503;
/*
 * You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Subscribe to see which companies asked this question
 */
public class ClimbingStairs {
public int climbStairs(int n) {
        if(n==0){
        	return 0;
        }
       
        int way[]=new int[n+1];
        way[0]=1;
        way[1]=1;
        for(int i=2;i<=n;i++){
        	way[i]=way[i-1]+way[i-2];
        }
        return way[n];
    }
}
