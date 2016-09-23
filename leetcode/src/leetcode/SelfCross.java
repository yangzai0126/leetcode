package leetcode;

public class SelfCross {

public boolean isSelfCrossing(int[] x) {
	    int length=x.length;
	   
	    for(int i=0;i<length;i++){//三种情况
        if(i>=3&&x[i-3]>=x[i-1]&&x[i]>=x[i-2]){//第一种；
        	return true;
        }
       if(i>=4&&x[i]+x[i-4]>=x[i-2]&&x[i-1]==x[i-3]){
    	   return true;
       }
       if(i>=5&&x[i-1]<x[i-3]&&x[i-2]>x[i-4]&&x[i]+x[i-4]>=x[i-2]&&x[i-1]+x[i-5]>=x[i-3]){
    	   return true;
       }
	    }
		return false;
	  
    }
}
