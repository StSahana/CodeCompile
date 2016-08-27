package algorithm.idea;

import java.util.Arrays;

import org.junit.Test;

import algorithm.idea.DecimalConversion;

public class ConverterTest {

	@Test
	public void testDesToOther(){
		System.out.println(new DecimalConversion().decToOther(121,2));//1111001
	}
	
	@Test
	public void testAssign(){
		Assign assign=new Assign(8);
		assign.assign(1,8);
		System.out.println(Arrays.deepToString(assign.a));
	}
	
	@Test
	public void test(){
		int[] i=new int[3];
	}
}
