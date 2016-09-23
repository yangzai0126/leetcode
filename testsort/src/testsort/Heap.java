package testsort;
import java.util.*;
public class Heap {
	//堆的底层数据结构就是 数组 
	//HashMap的底层 是Entry数组
	//TreeMap 是红黑树  root节点
	//将元素a[i]插入到合适位置
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
 //在数组第n个下标处插入 新的元素
 public void minHeapAddNumber(int a[],int n,int number){
	 a[n]=number;
	 minHeapFixup(a,n);
 }
 //调整 a 为数组 i为要调整节点  比i大的都调整好了 n 为数组长度  调整
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
 //删除最小的节点
 public void minHeapDeletenumber(int a[],int n){
	 int value=a[n-1];
	 a[n-1]=a[0];
	 a[0]=value;
	 minHeapDownup(a,0,n-1);
 }
 
 //建立堆
 
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
