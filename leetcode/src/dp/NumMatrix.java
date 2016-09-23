package dp;
/*
 * 304. Range Sum Query 2D - Immutable  QuestionEditorial Solution  My Submissions
Total Accepted: 17860
Total Submissions: 79156
Difficulty: Medium
Given a 2D matrix matrix, find the sum of the elements inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).

Range Sum Query 2D
The above rectangle (with the red border) is defined by (row1, col1) = (2, 1) and (row2, col2) = (4, 3), which contains sum = 8.
 */
//这个题和NUMarray一样主要是找对关系主要是画图分析就可以
public class NumMatrix {
	int sum[][];
	 public NumMatrix(int[][] matrix) {
	        int m=matrix.length;
	        if(m>0){
	        	int n=matrix[0].length;
	        	sum=new int[m][n];
	            sum[0][0]=matrix[0][0];
	            for(int i=1;i<m;i++)
	            	sum[i][0]=sum[i-1][0]+matrix[i][0];
	            for(int j=1;j<n;j++)
	            	sum[0][j]=sum[0][j-1]+matrix[0][j];
	            for(int i=1;i<m;i++)
	        	for(int j=1;j<n;j++){
	        		sum[i][j]=sum[i][j-1]+sum[i-1][j]-sum[i-1][j-1]+matrix[i][j];
	        	}
	        }
	    }

	    public int sumRegion(int row1, int col1, int row2, int col2) {
	    	if(row1==0&&col1==0)
	    		return sum[row2][col2];
	    	else if(row1==0)
	    		return sum[row2][col2]-sum[row2][col1-1];
	    	else if(col1==0)
	    		return sum[row2][col2]-sum[row1-1][col2];
	    	else
	        return sum[row2][col2]-sum[row1-1][col2]-sum[row2][col1-1]+sum[row1-1][col1-1];
	    }
}
