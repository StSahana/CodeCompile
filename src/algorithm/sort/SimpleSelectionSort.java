package algorithm.sort;
/**
 * 简单选择排序
 * @author Administrator
 */
public class SimpleSelectionSort {
	
	public int[] sort(int[] arr){
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}
