package testsort;

public class TestSort {

	public static void main(String args[]){
		int array[]={9,7,8,6,5,4,3,2,1};
		//insertSort(array,9);
		//shellSort(array,9);
		//bubbleSort(array,9);
		//advancedBubbleSort(array,9);
		//quikSort(array,0,8);
		//int temp[]=new int[9];
		//mergeSort(array,temp,0,8);
		//selectSort(array,9);
		Heap heap =new Heap();
		heap.minheapsortTodescendarray(array, 9);
		for(int i=0;i<9;i++)
		System.out.println(array[i]);
	}
	//直接插入排序
	public static void insertSort(int a[],int n){
		for(int i=1;i<n;i++){
			if(a[i]<a[i-1]){
				int guard=a[i];
				a[i]=a[i-1];
				int j=i-2;
				while(j>=0&&guard<a[j]){
				a[j+1]=a[j];
				j--;
			}
				a[j+1]=guard;
			}
			
		}
	}
	
	//希尔排序
	public static void shellInsertSort(int a[],int n,int dk){
		for(int i=dk;i<n;i++){
			if(a[i]<a[i-dk]){
				int guard=a[i];
				a[i]=a[i-dk];
				int j=i-2*dk;
				while(j>=0&&guard<a[j]){
					a[j+dk]=a[j];
					j=j-dk;
				}
				a[j+dk]=guard;
			}
		}
	}
	public static void shellSort(int a[],int n){
		int dk=n/2;
		while(dk>=1){
			shellInsertSort(a,n,dk);
			dk=dk/2;
		}
	}
	
	//冒泡排序
	
	public static void bubbleSort(int a[],int n){
		for(int i=0;i<n-1;i++){//排序的次数
			for(int j=0;j<n-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
	}
	
	//改进的冒泡排序 加入一个position记录 上一次排序最后交换的位置
	
	public static void advancedBubbleSort(int a[],int n){
		int i=n-1;
		while(i>0){
			int pos=0;
			for(int j=0;j<i;j++){
				if(a[j]>a[j+1]){
					pos=j;
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
			i=pos;
		}
	}
	
	//快速排序 
	public static int partition(int a[],int low,int high){
		int base=a[low];
		while(low<high){
		while(low<high&&base<=a[high])
			high--;
		if(low!=high){
		swap(a,low,high);
		low++;
		}
		while(low<high&&base>=a[low])
			low++;
		if(low!=high){
			swap(a,low,high);
			high--;
		}
		}
		return low;
	}
	public static void swap(int a[],int low,int high){
		int temp=a[low];
		a[low]=a[high];
		a[high]=temp;
	}
	public static void quikSort(int a[],int low,int high){
		if(low<high){
		int mid=partition(a,low,high);
		quikSort(a,low,mid-1);
		quikSort(a,mid+1,high);
		}
	}
	
	//归并排序
	
	public static void merge(int [] array,int temp[],int left,int middle,int right){
		int i=left;
		int j=middle+1;
		int t=left;
		while(i<=middle&&j<=right){
			if(array[i]>array[j]) {
				temp[t++]=array[j++];
			}else{
				temp[t++]=array[i++];
			}
		}
		
		while(i<=middle){
			temp[t++]=array[i++];
		}
		while(j<=right){
			temp[t++]=array[j++];//temp用于存放临时的正确位置
		}
		while(t>left){
			t--;
			array[t]=temp[t];
			
		}
	}
	
	public static void mergeSort(int a[],int temp[],int left,int right){
		if(left<right){
		int middle =(left+right)/2;
		mergeSort(a,temp,left,middle);//
		mergeSort(a,temp,middle+1,right);
		merge(a,temp,left,middle,right);
		}
		
	}
	
	
	//直接选择排序
	 public static void selectSort(int a[],int n){
		 for(int i=0;i<n-1;i++){
			 selectMin(a,i,n-1);
		 }
	 }
	 public static void selectMin(int a[],int left,int right){
		 if(left<right){
			 int min=a[left];
			 int pos=left;
			 int start=left;
			 while(start<right){
				 if(a[++start]<min){
					 min=a[start];
					 pos=start;
				 }
			 }
			 a[pos]=a[left];
			 a[left]=min;
		 }
	 }
	 
	 //堆排序
	 
	 
	 //线性查找递归求解
	 public static int linerSearch(int a[],int left,int right,int target){
		 if(left<right){
		 if(a[left]==target) return left;
		 else return linerSearch(a,left+1,right,target);
		 }else return -1;
	 }
	 
	
}
