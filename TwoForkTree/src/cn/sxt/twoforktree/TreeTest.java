package cn.sxt.twoforktree;

public class TreeTest {
	
	public static void main(String[] args) {
		//初始化一个Integer类型的数组，用来存储一组数据，这组数据用来插入二叉树中
		Integer[] arr = {4,5,7,9,3};
		//创建二叉树的根节点
		MyTree root = new MyTree(arr[0]);
		//使用遍历的方法将数组中的其他数据插入到二叉树中
		for(Integer i = 1;i<arr.length;i++){
			root.insertData(root, arr[i]);
		}
		
		//实例化一个ErgodicMethod对象
		ErgodicMethod em = new ErgodicMethod();
		em.frontBianli(root);
		System.out.println();
		em.midBianli(root);
		System.out.println();
		em.handBianli(root);
	}
}
