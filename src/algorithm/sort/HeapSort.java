package algorithm.sort;
/**
 * 堆排序(从小到大最大堆)
 * @author Administrator
 *
 */
public class HeapSort {
  
    public void swap(int[] arr, int i, int j) {  
        if (i == j) {  
            return;  
        }  
        arr[i] = arr[i] + arr[j];  
        arr[j] = arr[i] - arr[j];  
        arr[i] = arr[i] - arr[j];  
    }  
  
    public int[] sort(int[] arr) {  
        for (int i = 0; i < arr.length; i++) {  
            createMaxdHeap(arr, arr.length - 1 - i);  
            swap(arr, 0, arr.length - 1 - i);  
        }  
        return arr;
    }  
  
    public void createMaxdHeap(int[] arr, int lastIndex) {  
        for (int i = (lastIndex - 1) / 2; i >= 0; i--) {  
            // 保存当前正在判断的节点  
            int k = i;  
            // 若当前节点的子节点存在  
            while (2 * k + 1 <= lastIndex) {  
                // 找到左右孩子中的最大值，赋值给biggerIndex
                int biggerIndex = 2 * k + 1;  
                if (biggerIndex < lastIndex) {  
                    if (arr[biggerIndex] < arr[biggerIndex + 1]) {  
                        biggerIndex++;  
                    }  
                } 
                // 若当前节点值比子节点最大值小，则交换2者得值，交换后将biggerIndex值赋值给k
                if (arr[k] < arr[biggerIndex]) {  
                    swap(arr, k, biggerIndex);  
                    k = biggerIndex;  
                } else {  
                    break;  
                }  
            }  
        }  
    }  
  
}
