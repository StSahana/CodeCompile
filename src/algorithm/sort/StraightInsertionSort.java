package algorithm.sort;


/**
 * 直接插入排序
 * O(n2)
 * 稳定
 * @author Administrator
 *
 */
public class StraightInsertionSort {


	public int[] sort(int[] arr){
		int temp;
		for (int i = 1; i < arr.length; i++) {//第一个不用比较，略过
			temp=arr[i];//要插入的变量
			for (int j = 0; j < i; j++) {
				//移动
				if(temp<arr[j]){
					for (int k=i;k>j;k--) {
						arr[k]=arr[k-1];
					}
					arr[j]=temp;
					break;
				}
				
			}
		}
		return arr;
	}
	
}
