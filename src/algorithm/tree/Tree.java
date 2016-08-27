package algorithm.tree;


public interface Tree<T>{
	
	
	//是否存在某节点
	boolean isContain(T data);
	//左子树
	BinTree<T> getLeftTree();
	//获得右子树
	BinTree<T> getRightTree();
	//销毁方法
	void destroy();
	int size();
	boolean isEmpty();
	
	

}
