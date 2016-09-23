package leetcode0513;
/*
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?
 */
public class UniquePaths {
public int uniquePaths(int m, int n) {
        int path =m+n-2;
        int min=Math.min(m, n);
        int end = path-min+1;
        int fenzi =1;
        int fenmu=1;
        for(int i=path;i>end;i--){
        	fenzi*=i;
        }
        for(int j=2;j<=end;j++){
        	fenmu*=j;
        }
        return fenzi/fenmu;
    }
public int uniquePaths1(int m, int n) {
	if(m==1||n==1){
		return 1;
	}
	int dy[][]=new int[m][n];
	for(int i=0;i<m;i++){
		dy[i][0]=1;
	}
	for(int i=0;i<n;i++){
		dy[0][n]=1;
	}
	for(int i=1;i<m;i++)
		for(int j=1;j<n;j++){
			dy[i][j]=dy[i-1][j]+dy[i][j-1];
		}
	return dy[m-1][n-1];
}
}
