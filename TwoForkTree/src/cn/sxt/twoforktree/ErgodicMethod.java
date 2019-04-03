package cn.sxt.twoforktree;

//二叉树的遍历方法
public class ErgodicMethod {
	
	//二叉树的前序遍历
	public void frontBianli(MyTree mt){
		if(mt!=null){
			System.out.print(mt.data+"-");
			frontBianli(mt.left);
			frontBianli(mt.right);
		}
	}
	
	//二叉树的中序遍历
	public void midBianli(MyTree mt){
		if(mt!=null){
			midBianli(mt.left);
			System.out.print(mt.data+"-");
			midBianli(mt.right);
		}
	}
	
	//二叉树的后序遍历
	public void handBianli(MyTree mt){
		if(mt!=null){
			handBianli(mt.left);
			handBianli(mt.right);
			System.out.print(mt.data+"-");
		}
	}
}
