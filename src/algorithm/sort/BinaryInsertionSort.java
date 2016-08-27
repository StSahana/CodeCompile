package algorithm.sort;
/**
 * 二分插入排序
 * @author Administrator
 *
 */
public class BinaryInsertionSort {
	
	
	
	public int[] sort(int[] arr){
		int temp;
		int left,right,mid;
		for (int i = 1; i < arr.length; i++) {//第一个不用比较，略过
			temp=arr[i];//要插入的变量
			left=0;
			right=i-1;
			while(right>=left){
				 mid = ( left + right ) / 2; //　指向已排序好的中间位置
				 if(temp>=arr[mid]){
					 left=mid+1;//进入右区间
				 }else{
					 right=mid-1;//左区间
				 }
			}
			for(int j=i;j>left;j--){
				arr[j]=arr[j-1];
			}
			
			arr[left]=temp;
			
		}
		return arr;
	}
}
