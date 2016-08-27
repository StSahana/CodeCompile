package algorithm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import algorithm.list.List;

/**
 * 二叉树
 * 
 * @author Administrator
 * @param <T>
 *
 */
public class BinTree<T> implements Tree<T> {
	public TreeNode<T> root;

	public BinTree() {
		root = null;
	}

	public BinTree(T data) {
		super();
		this.root = new TreeNode<T>(data);
	}

	@Override
	public boolean isEmpty() {
		return root == null;
	}
	
	@Override
	public boolean isContain(T data) {
		return root.isContain(data);
	}

	@Override
	public int size() {
		if(root==null){
			return 0;
		}else{
			return root.size();
		}
	}
	
	@Override
	public BinTree<T> getLeftTree(){
		if(root!=null){
			this.root=root.leftNode;
			return this;
		}else{
			System.out.println("操作错误:树为空");
			return null;
		}
	}
	
	@Override
	public BinTree<T> getRightTree(){
		if(root!=null){
			this.root=root.rightNode;
			return this;
		}else{
			System.out.println("操作错误:树为空");
			return null;
		}
	}

	
	@Override
	public void destroy() {
		this.root=null;
	}

	

	

	
	
	
	

}