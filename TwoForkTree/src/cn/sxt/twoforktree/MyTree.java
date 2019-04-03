package cn.sxt.twoforktree;

//二叉树中，左节点都比根节点小，右节点都比根节点大

public class MyTree {
	
	Integer data;//节点中的数据
	MyTree left;//二叉树的左节点
	MyTree right;//二叉树的右节点
	
	public MyTree(Integer data) {//二叉树的构造方法，用来创建二叉树的根节点
		super();
		this.data = data;
		left = null;
		right = null;
	}
	/**
	 * 这是一个描述插入二叉树数据的方法
	 * @param root   二叉树的根节点
	 * @param data   根节点上要插入的数据
	 */
	
	public void insertData(MyTree root,Integer data){
		if(data>root.data){//如果要插入的数据大于根节点的数据，它将会放置于右节点
			if(root.right==null){
				root.right = new MyTree(data);
			}else{
				insertData(root.right, data);
			}	
		}else{//如果要插入的数据小于根节点的数据，它将会被放置于左节点
			if(root.left==null)
				root.left = new MyTree(data);
			else
				insertData(root.left, data);	
		}
	}
	
	
	 
}
