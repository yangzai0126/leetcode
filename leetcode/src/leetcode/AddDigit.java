package leetcode;

public class AddDigit {

	 public int addDigits(int num) {
		 int r=num;//��ʼ��r 
		 while(r>=10){//��λ����Ӻ���
			 num=r;//
			 r=0;
	        while(num!=0){
	        	r=r+num%10;//ȡ��ø�λ��֮��
	        	num=num/10;
	        	
	        }
		 }
	        return r;
	    }
	 
}
