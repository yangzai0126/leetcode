package leetcode0504;
import java.util.*;
import java.util.Map.Entry;
/*
 * Given a non-empty array of integers, return the k most frequent elements.

For example,
Given [1,1,1,2,2,3] and k = 2, return [1,2].
 */

public class TopkElement {

	 public List<Integer> topKFrequent(int[] nums, int k) {
	        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	        for(int i=0;i<nums.length;i++){
	        	if(hm.containsKey(nums[i])){
	        		int value=hm.get(nums[i]);
	        		value++;
	        		hm.put(nums[i], value);
	        	}else{
	        		hm.put(nums[i], 1);
	        	}
	        }//HashMap不能遍历
	        List<Map.Entry<Integer, Integer>> lem= new ArrayList<Map.Entry<Integer, Integer>>(hm.entrySet());
	       Collections.sort(lem, new Comparator<Map.Entry<Integer, Integer>>(){

			@Override
			public int compare(Map.Entry<Integer, Integer> o1,
					Entry<Integer, Integer> o2) {
				// TODO 自动生成的方法存根
				return o1.getValue()-o2.getValue();
			}
	    	   
	       });
	       int size=lem.size();
	       List<Integer> ll= new ArrayList<Integer>();
	       for(int i=size-1;i>=size-k;i--){
	    	   ll.add(lem.get(i).getValue());
	       }
	       return ll;
	    }
	 
	 public List<Integer> topKFrequent1(int[] nums, int k) {
	        List<Integer> res = new ArrayList<Integer>();
	        Map<Integer,FEntity> map = new HashMap<Integer,FEntity>();
	        //统计各数字出现的次数 存入hashmap
	        for(int t:nums){
	            FEntity f;
	            if(map.containsKey(t)){
	                f = map.get(t);
	                f.frequent++;
	            }else{
	                f = new FEntity(t, 1);
	            }
	            map.put(t, f);
	        }
	        //对hashmap的value 按照频率进行排序
	        List<FEntity> values = new ArrayList<FEntity>();
	        Set<Integer> keys = map.keySet();
	        for(Integer key:keys){
	            values.add(map.get(key));
	        }
	        Collections.sort(values);
	        //统计频率最高的k个数
	        for(int i=0;i<k;i++){
	            res.add(values.get(values.size()-1-i).num);
	        }
	        return res;
	    }

	    class FEntity implements Comparable<FEntity> {
	        int num, frequent;

	        public FEntity(int num, int frequent) {
	            this.num = num;
	            this.frequent = frequent;
	        }

	        public int compareTo(FEntity arg0) {
	            if (frequent > arg0.frequent)
	                return 1;
	            else if (frequent == arg0.frequent)
	                return 0;
	            else
	                return -1;
	        }
	    }
	    /*
	     * 第三种
	     */
	    public void swap(int[] nums,int a,int b){
	        int tmp=nums[a];
	        nums[a]=nums[b];
	        nums[b]=tmp;
	    }
	    /**
	     * 寻找到第K大的位置的频率，近似与快排
	     * */
	    public int findK(int[] nums,int k){
	        int start=0,end=nums.length-1;
	        while(start<=end){
	            int i=start,j=end;
	            while(i<j){
	                while(i<j && nums[j]>=nums[i]) j--;
	                swap(nums,i,j);
	                while(i<j && nums[i]<=nums[j]) i++;
	                swap(nums,i,j);
	            }
	            if(i==k-1)
	                return nums[i];
	            if(i<k-1)
	                start=i+1;
	            else end=i-1;
	        }
	        return 0;
	    }
	    public List<Integer> topKFrequent2(int[] nums, int k) {
	        List<Integer> list = new ArrayList<Integer>();
	        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	        for(int i=0;i<nums.length;i++){
	            if(map.containsKey(nums[i])==false) map.put(nums[i],0);
	            map.put(nums[i],map.get(nums[i])+1);
	        }
	        Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator();
	        int items[] =new int[map.size()];
	        int fre[] =new int[map.size()];
	        int b_fre[] =new int[map.size()];
	        int count=0;
	        while(it.hasNext()) {
	            Map.Entry<Integer,Integer> entry= it.next();
	            items[count] = entry.getKey();
	            fre[count] = entry.getValue();
	            b_fre[count++] = entry.getValue();
	        }
	        //注意这里的寻找k，因为我们是找前k个最大的，所以等同于我要找到第b_fre.length-k小的位置
	        int index=findK(b_fre,b_fre.length-k);
	        for(int i=0;i<fre.length;i++){
	            if(fre[i]> index)
	                list.add(items[i]);
	        }
	        return list;
	    }
}
