package leetcode0429;
/*
 * Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

Subscribe to see which companies asked this question

//������ҩ����֪������ ���������� I V X  L C D M ���  I������ V X������ ��ʾ�� ͬ�� X ������ L C ���� C ������ D M ����  
 * ������ֻ����һλ   IXC �����λ���� 
 * Integerת Roman ���� 
 * 
 */
public class RomanInteger {

public int romanToInt(String s) {
        char rm[] =s.toCharArray();
        int length=rm.length;
        int count=0;
        for(int i=0;i<length-1;i++){
        	if(rm[i]=='I'&&(rm[i+1]=='V'||rm[i+1]=='X')){
        		count=count-switchi(rm[i]);//������ͼ�
        	}else if(rm[i]=='X'&&(rm[i+1]=='L'||rm[i+1]=='C')){
        		count=count-switchi(rm[i]);
        	}else if(rm[i]=='C'&&(rm[i+1]=='D'||rm[i+1]=='M')){
        		count=count-switchi(rm[i]);
        	}else {
        		count=count+switchi(rm[i]);
        	}
        	
        }
        count=count+switchi(rm[length-1]);
        return count;
    }
public int switchi(char c){
	switch(c){
	case 'I':
		return 1;
	case 'V':
		return 5;
	case 'X':
		return 10;
	case 'L':
		return 50;
	case 'C':
		return 100;
	case 'D':
		return 500;
	case 'M':
		return 1000;
		default:
			return 0;
	}
}

}
