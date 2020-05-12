package com.kh.example.map.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.mode.vo.Snack;

public class MapController {
	public void doMap() {
		Map<String, Snack> map = new HashMap<String, Snack>();
		
		//1. 객체요소 추가
		//컬렉션의 상속을 받지 않아 리스트와 셋과는 다르다
		//put(K key, V value) : 키와 값 추가, 성공시 값(value) 반환
		map.put("새우깡", new Snack("짠맛", 1500));
		map.put("다이제", new Snack("단 맛", 2500));
		map.put("포테이토칩", new Snack("짠맛", 1500));
		map.put("고소미", new Snack("고소한 맛", 1000));
		System.out.println(map);
		//key = value 형식으로 출력됨
//		1500원 중복되지만 순서유지 안됨
		

		map.put("새우깡", new Snack("매운맛", 1500));
		System.out.println(map);
		//새우깡이 추가되지 않았지만 매운맛으로 덮어씌워짐 --> 키값은 중복되지 않고 덮어씌워지기 때문
		
		//2.키 또는 값이 있는지 없는지 확인하는 메소드
		//containsKey(Object key) : key가 있으면 true반환
		//containsValue(Object value) : value가 있으면 true 반환
		System.out.println(map.containsKey("새우깡"));
		System.out.println(map.containsValue(new Snack("짠맛", 1500)));
		//새로운 짠맛이 만들어져서 주소값이 달라져 찾을 수 없음
		//그래서 snack에 haseCode와 equals 오버라이딩 해야함
		//오버라이딩 후에는 true 나옴
		
		//get(Object key) : 키와 세트인 값 반환  = 키가 갖고있는 값 반환
		System.out.println(map.get("새우깡"));
		System.out.println(map.get("홈런볼"));
		
		//map을 set이나 list화 시키는 방법
		//1.values() : 모든 value를 Collection에 담아 반환
		System.out.println(map.values());
		
		//2.keySet() : 모든 key를 set에 담아 반환
		Set<String> set1 = map.keySet();   //맵 안에 있는 키를 셋안에 담아둠
//		System.out.println(set1);     //[다이제, 새우깡, 포테이토칩, 고소미]
		Iterator<String> it = set1.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("키 : " + key + ", 값 : " + map.get(key));
		}
		
		//3.entrySet() : 모든 entry 객체(키, 값의 쌍)을 set에 담아 반환
		Set<Entry<String, Snack>> set2 = map.entrySet();
		Iterator<Entry<String, Snack>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			System.out.println("키 : " + entry.getKey() + ", 값 : " + entry.getValue());
		}
		
		Map<String, Snack> map2 = new TreeMap<String, Snack>();
		map2.putAll(map);
		System.out.println(map2);			//오름차순으로 정렬되서 나옴   key값으로 정한 String에 Comparable이 오버라이딩 되어있어서
		
	}
	public void doProperties() {
		Properties prop = new Properties();
		//put사용하면 안됨. hashtable을 상속받아서 오브젝트가 매개변수안에 들어감
		prop.setProperty("채소", "오이" );
		prop.setProperty("과일", "사과");
		prop.setProperty("간식", "젤리");
		prop.setProperty("채소", "피망");
		System.out.println(prop);
		//map이라 순서 없음.  오이 먼저 넣었지만 피망이 뒤에 와서 피망으로 덮어씌워짐(key가 중복 안되서)
		
		System.out.println(prop.getProperty("채소"));		//채소에 있는 걸 가져와
		System.out.println(prop.getProperty("채소", "땅콩"));	//첫번째 있는 키의 값을 가져와.
		System.out.println(prop.getProperty("견과", "땅콩"));  //키의 값이 없다면 생성해서 만들어진 값 가져와
		 //시험제출
	}
	public void fileSave() {
//		try(FileOutputStream fos = new FileOutputStream("test.properties");){
		try(FileOutputStream fos = new FileOutputStream("test.xml");){
			
			Properties prop = new Properties();
			prop.setProperty("title", "Properties Practice");
			prop.setProperty("language", "kor");
			
			//store(OutputStream os, String comments)
			//store(Writer writer, String comments)
			//os(또는 writer)에 prop저장(바이트 또는 문자형식으로), comments는 주석으로 저장
//			prop.store(fos, "Properties Test File");	//프로퍼티 형식 저장하는 방법
			
//			storeToXML(OutputStream os, String comments)
//			저장된 정보를 바이트 스트림으로  XML 출력 저장
			prop.storeToXML(fos, "storeToXML Test");
			
		} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
		}
		
	}

	public void fileOpen() {
//		try(FileInputStream fis = new FileInputStream("test.properties");){
		try(FileInputStream fis = new FileInputStream("test.xml");){
			
			Properties prop = new Properties();
			//load(InputStream is) : 바이트스트림으로 저장된 파일의 내용을 읽어와서 properties객체에 저장
			//load(Reader reader) : 문자스트림으로 저장된 파일의 내용을 읽어와서  properties객체에 저장
			
//			prop.load(fis);  // 이 스트림을 이용해서  prop에 담겠다
			
			//loadFromXML(InputStream is)
			// : 바이트스트림으로 저장된 xml파일의 내용을 읽어와서 properties 객체에 저장
			prop.loadFromXML(fis);
			
			System.out.println(prop);
			
		}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();

}
	}
}
