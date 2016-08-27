package algorithm.tree;

import org.junit.Test;

public class TreeTest {
	@Test
	public void test(){
		BinTree<Integer> tree=new BinTree<Integer>(1);
		System.out.println(tree.isContain(3));
	}

}
