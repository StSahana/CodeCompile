package algorithm.sort;

import java.util.Iterator;

import javax.xml.transform.Templates;

/**
 * 希尔排序(缩小增量排序)
 * @author Administrator
 *
 */
public class ShellSort {
	
	public int[] sort(int[] arr){
		int gap,temp;
		for (gap=arr.length/2;gap>0;gap/=2) {
			for(int i=0;i<gap;i++){
				for(int j=i+gap;j<arr.length;j+=gap){//略过第一个
					if(arr[j]<arr[j-gap]){
						temp=arr[j];
						//所有比temp大的后
						int k=j-gap;
						while (k>=0&&arr[k]>temp) {
							arr[k+gap]=arr[k];
							k-=gap;
						}
						arr[k+gap]=temp;
					}
				}
			}
		}
		return arr;
	}

}
