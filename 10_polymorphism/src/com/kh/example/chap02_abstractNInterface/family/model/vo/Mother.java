package com.kh.example.chap02_abstractNInterface.family.model.vo;

public class Mother extends Family implements Basic{
//	The type Mother must implement the inherited abstract method Family.sleep()
	//�йи��� �ִ� �߻�޼ҵ� sleep�� �ذ��ؾ��Ѵٴ� ��
	
	
//	-babyBirth : String
//	
//	+Mother()
//	+Mother(name:String, weight:double, health :int, babyBirth:String)
//	
//	+getter/setter
//	+toSting() : String
	
	private String babyBirth;
	
	public Mother() {}
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
		
	public String getBabyBirth() {
		return babyBirth;
	}
	
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	@Override
		public String toString() {
			return "Mother [" + super.toString() + babyBirth + "]";
		}
	@Override
	public void eat() {
		super.setWeight(super.getWeight() + 10);
		super.setHealth(super.getHealth() -5);
		
	}
	@Override
	public void sleep() {
		super.setHealth(super.getHealth() + 10);
	
		
	}

}
