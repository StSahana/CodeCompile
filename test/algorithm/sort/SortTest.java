package algorithm.sort;
import java.util.Arrays;

import org.junit.Test;


public class SortTest {
	int[] arr={4,3,5,2,5,1,7,8};
	
	@Test
	public void testSIsort(){
		System.out.println(Arrays.toString(new StraightInsertionSort().sort(arr)));
	}
	
	@Test
	public void testBubbleSort(){
		System.out.println(Arrays.toString(new BubbleSort().sort(arr)));
	}
	
	@Test
	public void testBISort(){
		System.out.println(Arrays.toString(new BinaryInsertionSort().sort(arr)));
	}
	
	@Test
	public void testSimpleSelectionSort(){
		System.out.println(Arrays.toString(new SimpleSelectionSort().sort(arr)));
	}
	
	@Test
	public void testShellSort(){
		System.out.println(Arrays.toString(new ShellSort().sort(arr)));
	}
	
	@Test
	public void testMergeSort(){
		System.out.println(Arrays.toString(new MergeSort().sort(arr)));
	}
	
	@Test
	public void testQuickSort(){
		System.out.println(Arrays.toString(new QuickSort().sort(arr)));
	}
	
	@Test
	public void testHeapSort(){
		System.out.println(Arrays.toString(new HeapSort().sort(arr)));
	}

}
