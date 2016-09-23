package leetcode;

public class AddDigit {

	 public int addDigits(int num) {
		 int r=num;//初始化r 
		 while(r>=10){//各位数相加后结果
			 num=r;//
			 r=0;
	        while(num!=0){
	        	r=r+num%10;//取余得各位数之和
	        	num=num/10;
	        	
	        }
		 }
	        return r;
	    }
	 
}
