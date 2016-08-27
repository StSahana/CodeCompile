package algorithm.sort;

public class BubbleSort {
	
	
	/**
	 * 优化
	 * @param arr
	 * @return
	 */
	public int[] sort(int[] arr){
		int temp;
		boolean flag=true;//是否经过交换
		for (int i = 0; i < arr.length-1&&flag; i++) {//次数
			flag=false;//如果没有经过交换，说明以排好序
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
		}
		return arr;
	}
	/*
	 *未优化
	 */
	public int[] sort1(int[] arr){
		int temp;
		for (int i = 0; i < arr.length-1; i++) {//次数
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	/**
	 * 设置一标志性变量pos,用于记录每趟排序中最后一次进行交换的位置。
	 * 由于pos位置之后的记录均已交换到位,故在进行下一趟排序时只要扫描到pos位置即可。
	 */
	/**
	 * 传统冒泡排序中每一趟排序操作只能找到一个最大值或最小值,
	 * 我们考虑利用在每趟排序中进行正向和反向两遍冒泡的方法一次可以得到两个最终值(最大者和最小者) , 
	 * 从而使排序趟数几乎减少了一半。
	 */
}
