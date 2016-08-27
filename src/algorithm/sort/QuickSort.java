package algorithm.sort;
/**
 * 快速排序
 * 平均时间复杂度为O(nlgn)
 * 参考文章：http://ahalei.blog.51cto.com/
 * @author Administrator
 *
 */

public class QuickSort {
	
	public void  quickSort(int[] arr,int left,int right){//从m位开始到n
		if(left<right){
		int i=left;
		int j=right;
		int base=arr[left];//基准
		int temp;
		while(left<right){
			while(arr[right]>=base) right--;
			while(arr[left]<=base&&left<right) left++;
			if(left!=right){
				temp=arr[right];
				arr[right]=arr[left];
				arr[left]=temp;	
			}else{
				arr[i]=arr[left];
				arr[left]=base;
			}
		}	
		quickSort(arr, i, left-1);
		quickSort(arr, left+1, j);
		}
	}
	
	public int[] sort(int [] arr){
		quickSort(arr,0,arr.length-1);
		return arr;
	}
}
