package com.kh.example.chap02_abstractNInterface.family.model.vo;

import java.io.Serializable;

public interface Basic extends Cloneable, Serializable{
	//							--------------------- ==> Marker Interface : 내부에 선언된것이 없고 이름만 있는 인터페이스
	//														인터페이스를 구현한 클래스의 특성을 나타내주기 위해 사용
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
}
