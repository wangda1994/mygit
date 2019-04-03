package cn.sxt.twoforktree;

//�������ı�������
public class ErgodicMethod {
	
	//��������ǰ�����
	public void frontBianli(MyTree mt){
		if(mt!=null){
			System.out.print(mt.data+"-");
			frontBianli(mt.left);
			frontBianli(mt.right);
		}
	}
	
	//���������������
	public void midBianli(MyTree mt){
		if(mt!=null){
			midBianli(mt.left);
			System.out.print(mt.data+"-");
			midBianli(mt.right);
		}
	}
	
	//�������ĺ������
	public void handBianli(MyTree mt){
		if(mt!=null){
			handBianli(mt.left);
			handBianli(mt.right);
			System.out.print(mt.data+"-");
		}
	}
}
