package cn.sxt.twoforktree;

//�������У���ڵ㶼�ȸ��ڵ�С���ҽڵ㶼�ȸ��ڵ��

public class MyTree {
	
	Integer data;//�ڵ��е�����
	MyTree left;//����������ڵ�
	MyTree right;//���������ҽڵ�
	
	public MyTree(Integer data) {//�������Ĺ��췽�������������������ĸ��ڵ�
		super();
		this.data = data;
		left = null;
		right = null;
	}
	/**
	 * ����һ������������������ݵķ���
	 * @param root   �������ĸ��ڵ�
	 * @param data   ���ڵ���Ҫ���������
	 */
	
	public void insertData(MyTree root,Integer data){
		if(data>root.data){//���Ҫ��������ݴ��ڸ��ڵ�����ݣ�������������ҽڵ�
			if(root.right==null){
				root.right = new MyTree(data);
			}else{
				insertData(root.right, data);
			}	
		}else{//���Ҫ���������С�ڸ��ڵ�����ݣ������ᱻ��������ڵ�
			if(root.left==null)
				root.left = new MyTree(data);
			else
				insertData(root.left, data);	
		}
	}
	
	
	 
}
