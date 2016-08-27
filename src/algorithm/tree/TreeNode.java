package algorithm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TreeNode<T> {

	public T data;
	public TreeNode<T> leftNode;
	public TreeNode<T> rightNode;

	public TreeNode(T data, TreeNode<T> leftNode, TreeNode<T> rightNode) {
		super();
		this.data = data;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	public TreeNode(T data) {
		this(data, null, null);
	}

	/**
	 * 是否存在某元素
	 * 
	 * @param data
	 * @return
	 */
	public boolean isContain(T data) {
		boolean result = false;
		if (this.data.equals(data)) {
			result = true;
		} else {
			if (this.leftNode != null) {
				result = this.leftNode.isContain(data);
			}
			if (!result && this.rightNode != null) {
				result = this.rightNode.isContain(data);
			}
		}
		return false;
	}

	/**
	 * 节点数
	 */
	public int size() {
		int result = 1;
		if (leftNode != null) {
			result += leftNode.size();
		}
		if (rightNode != null) {
			result += rightNode.size();
		}
		return result;
	}

	/**
	 * 前序遍历
	 * 
	 * @param this
	 */
	public void preOrder() {
		System.out.print(this.data + " ");
		if (this.leftNode != null) {
			this.leftNode.preOrder();
		}
		if (this.rightNode != null) {
			this.rightNode.preOrder();
		}
	}

	/**
	 * 中序遍历
	 * 
	 * @param this
	 */
	public void inOrder() {
		if (this.leftNode != null) {
			this.leftNode.inOrder();
		}
		System.out.print(this.data + " ");
		if (this.rightNode != null) {
			this.rightNode.inOrder();
		}
	}

	/**
	 * 后序遍历
	 * 
	 * @param this
	 */
	public void postOrder() {
		if (this.leftNode != null) {
			this.leftNode.postOrder();
		}
		if (this.rightNode != null) {
			this.rightNode.postOrder();
		}
		System.out.print(this.data + " ");
	}

	/**
	 * 层次遍历
	 * 
	 * @param this
	 */
	public void levelOrder() {
		ArrayList<T> arr = new ArrayList<T>();
		Queue<TreeNode<T>> queue = new LinkedList<TreeNode<T>>();
		if (this != null) {
			queue.offer(this);
			if (!queue.isEmpty()) {
				TreeNode<T> current = queue.poll();
				arr.add(current.data);
				if (current.leftNode != null) {
					queue.add(current.leftNode);
				}
				if (this.rightNode != null) {
					queue.add(current.rightNode);
				}
			}
		}
		System.out.println(Arrays.toString(arr.toArray()));
	}

	// 深度
	public int depth() {
		int dep1;
		int dep2;
		if (this == null) {
			return 0;
		} else {
			dep1 = leftNode.depth();
			dep2 = rightNode.depth();
			if (dep1 > dep2)
				return dep1 + 1;
			else
				return dep2 + 1;
		}
	}

	// 是否是叶子节点
	public boolean isLeaf() {
		return this.leftNode == null && this.rightNode == null;
	}

}
