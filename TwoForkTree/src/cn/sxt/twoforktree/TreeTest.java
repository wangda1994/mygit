package cn.sxt.twoforktree;

public class TreeTest {
	
	public static void main(String[] args) {
		//��ʼ��һ��Integer���͵����飬�����洢һ�����ݣ������������������������
		Integer[] arr = {4,5,7,9,3};
		//�����������ĸ��ڵ�
		MyTree root = new MyTree(arr[0]);
		//ʹ�ñ����ķ����������е��������ݲ��뵽��������
		for(Integer i = 1;i<arr.length;i++){
			root.insertData(root, arr[i]);
		}
		
		//ʵ����һ��ErgodicMethod����
		ErgodicMethod em = new ErgodicMethod();
		em.frontBianli(root);
		System.out.println();
		em.midBianli(root);
		System.out.println();
		em.handBianli(root);
	}
}
