package com.kh.example.list.model.vo;

public class Student implements Comparable<Student>{
//	-name:String
//	-score:int
//	+Student()
//	+Student(name:String, score:int)
//	+getter/setter
//	+toString():String
	private String name;
	private int score;
	
	public Student() {}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name + score;
		}
	
	@Override
		public int hashCode() {
			final int prime = 31;    //��ǻ�Ͱ� �������� �� ������ ũ�鼭 ����ϱ� ���� �Ҽ�
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + score;
			return result;
		}
	//������ �ϴ� ����� ����. ������ ��Ŭ�������� �⺻ �����ϴ� ��� ���
	
	@Override
		public boolean equals(Object obj) {
			if(this == obj) {          //���� �� �ּҰ�(this�� �� �ּҰ��� ��� ���۷��� ����(����������))�� obj�� �ּҰ��� ���ٸ�
				return true;
			}
			if(obj == null) {    		//�Ű������� ���� obj�� null�̶��
				return false;
			}
			if(getClass() != obj.getClass()) {			//getclass = �� Ŭ������ ���� ������ ��� �ִ� �޼ҵ�.    ���� ��� �ִ� ������ obj�� ��� �ִ� ������ ���� �ʴٸ� false
				return false;
			}
			//student ��ü�� obj ��ü ��ü�� ���ϴ� ���
			
			//----------�� ��ü�� �ʵ� ���� ��
			Student other = (Student)obj;  // �Ű������� ���� obj�� ������ƮŬ�����̱� ������ �ڽ��� student�� ���� ���ؼ� student�� ����ȯ.
			if(name == null) {
				if(other.name != null) {
					return false;    //���� ���� �ִ� ������ ���� �� �ٸ� ������ ���� �ִ°� ���� �ƴϸ� ���� false
				}
			} else if(!name.equals(other.name)) {       //null�� �ƴϸ鼭 �����ִ� �̸��� �ٸ��� false
				return false;
			}//���� ���� �ִ� �ڷ����� �������ڷ����̸� if/else�� �̿��ؼ� ��
			
			if(score != other.score) {
				return false;    // �⺻���ڷ����� if�θ� ��
			}
			
			return true;
		}
	
	@Override
	public int compareTo(Student o) {
		//�̸��� ���ؼ� �������� ����
		//�̸� ==> string
		// ==> String�� ���� �������� ����
		
		String otherName = o.getName();
		/*
		  	compareTo�� ��ȯ�� : int
		  	�� ��ü�� �� ���� ������ 0�� ��ȯ
		  	�� ��ü�� �� ��󺸴� ũ�� 1�� ��ȯ
		  	�� ��ü�� �� ��󺸴� ������ -1 ��ȯ
		  	*/
		return name.compareTo(otherName);
//		return -name.compareTo(otherName);		���������� ���̳ʽ��� ���̸� ��
	}
	
}
