package testsort;
import java.util.*;
public class Heap {
	//�ѵĵײ����ݽṹ���� ���� 
	//HashMap�ĵײ� ��Entry����
	//TreeMap �Ǻ����  root�ڵ�
	//��Ԫ��a[i]���뵽����λ��
 public void minHeapFixup(int a[],int i){
	 int temp=a[i];
	 int j=(i-1)/2;
	 while(i!=0&&j>=0){
		 if(a[j]<=temp)
			 break;
		 a[i]=a[j];
		 i=j;
		 j=(i-1)/2;
	 }
	 a[i]=temp;
 }
 //�������n���±괦���� �µ�Ԫ��
 public void minHeapAddNumber(int a[],int n,int number){
	 a[n]=number;
	 minHeapFixup(a,n);
 }
 //���� a Ϊ���� iΪҪ�����ڵ�  ��i��Ķ��������� n Ϊ���鳤��  ����
 public void minHeapDownup(int a[],int i,int n){
	 int temp=a[i];
	 int left=2*i+1;
	 while(left<n){
	if(left+1<n&&a[left+1]<a[left])
		 left++;
		 if(temp<=a[left])
			 break;
		 a[i]=a[left];
		 i=left;
		 left=2*i+1;
	 }
	 a[i]=temp;
 }
 //ɾ����С�Ľڵ�
 public void minHeapDeletenumber(int a[],int n){
	 int value=a[n-1];
	 a[n-1]=a[0];
	 a[0]=value;
	 minHeapDownup(a,0,n-1);
 }
 
 //������
 
 public void makeMinHeap(int a[],int n){
	 for(int i=n/2-1;i>=0;i--){
		 minHeapDownup(a,i,n);
	 }
 }
 public void minheapsortTodescendarray(int a[], int n)  
 {   
	 makeMinHeap(a,n);
     for (int i = n ; i >= 2; i--)  
     {  
    	 minHeapDeletenumber(a,i);
     }  
 }  
}
