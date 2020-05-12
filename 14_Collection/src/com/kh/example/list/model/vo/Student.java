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
			final int prime = 31;    //컴퓨터가 인지했을 때 적당히 크면서 계산하기 좋은 소수
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + score;
			return result;
		}
	//재정의 하는 방법은 많다. 지금은 이클립스에서 기본 제공하는 방법 사용
	
	@Override
		public boolean equals(Object obj) {
			if(this == obj) {          //만약 내 주소값(this는 내 주소값을 담는 레퍼런스 변수(참조형변수))과 obj의 주소값이 같다면
				return true;
			}
			if(obj == null) {    		//매개변수로 들어온 obj가 null이라면
				return false;
			}
			if(getClass() != obj.getClass()) {			//getclass = 내 클래스에 대한 정보를 담고 있는 메소드.    내가 담고 있는 정보과 obj가 담고 있는 정보가 같지 않다면 false
				return false;
			}
			//student 객체와 obj 객체 자체를 비교하는 방법
			
			//----------두 객체의 필드 변수 비교
			Student other = (Student)obj;  // 매개변수로 들어온 obj는 오브젝트클래스이기 때문에 자식인 student가 받지 못해서 student로 형변환.
			if(name == null) {
				if(other.name != null) {
					return false;    //내가 갖고 있는 네임은 널일 때 다른 네임이 갖고 있는게 널이 아니면 리턴 false
				}
			} else if(!name.equals(other.name)) {       //null이 아니면서 갖고있는 이름이 다르면 false
				return false;
			}//내가 갖고 있는 자료형이 참조형자료형이면 if/else를 이용해서 비교
			
			if(score != other.score) {
				return false;    // 기본형자료형은 if로만 비교
			}
			
			return true;
		}
	
	@Override
	public int compareTo(Student o) {
		//이름에 대해서 오름차순 정렬
		//이름 ==> string
		// ==> String에 대해 오름차순 정렬
		
		String otherName = o.getName();
		/*
		  	compareTo의 반환값 : int
		  	비교 주체가 비교 대상과 같으면 0을 반환
		  	비교 주체가 비교 대상보다 크면 1을 반환
		  	비교 주체가 비교 대상보다 작으면 -1 반환
		  	*/
		return name.compareTo(otherName);
//		return -name.compareTo(otherName);		내림차순은 마이너스만 붙이면 됨
	}
	
}
