package algorithm.sort;

import java.util.Arrays;

/*
 * 归并排序
 * O(nlog⒉n)
 */
public class MergeSort {

	public int[] sort(int[] arr) {
		int mid = (arr.length) / 2;
		if (mid > 0) {//分组递归
			int[] a = Arrays.copyOf(arr, mid);
			int[] b = Arrays.copyOfRange(arr, mid, arr.length);
			return merge(sort(a), sort(b));
		} else {
			return arr;
		}
	}

	public int[] merge(int[] a, int[] b) {
		int i = 0, j = 0, k = 0;
		int[] c = new int[a.length + b.length];
		while (k < c.length) {
			while (i < a.length && j < b.length) {
				if (a[i] < b[j]) {
					c[k] = a[i];
					k++;
					i++;
				} else {
					c[k] = b[j];
					j++;
					k++;
				}
			}
			while (i < a.length) {
				c[k] = a[i];
				k++;
				i++;
			}
			while (j < b.length) {
				c[k] = b[j];
				k++;
				j++;
			}
		}
		return c;
	}

}
