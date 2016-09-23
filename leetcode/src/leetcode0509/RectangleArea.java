package leetcode0509;
/*
 * Find the total area covered by two rectilinear rectangles in a 2D plane.

Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

Rectangle Area
Assume that the total area is never beyond the maximum possible value of int.

//并集等于两个矩形的面积减去公共部分面积
 */
public class RectangleArea {
	
	 public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		 return (D-B)*(C-A)+(G-E)*(H-F)-computeArea1(A,B,C,D,E,F,G,H);
	 }
	 public int computeArea1(int A, int B, int C, int D, int E, int F, int G, int H) {//计算公共部分面积
	        if(A>=G||E>=C||B>=H||F>=D){
	        	return 0;
	        }else{
	        	return Math.min(Math.min(H-B, H-F),Math.min(D-F, D-B) )*Math.min(Math.min(C-A, C-E),Math.min(G-A, G-E) );
	        }
	        	
	    }
}
