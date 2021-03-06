package com.kh.example.chap02_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileSave() {
		try(FileWriter fw = new FileWriter("b_char.txt");) {
			// 마지막에 ;는 닫아야하는 stream이 많을 때 구분자로 넣어줌
		fw.write("와, IO 정말 재밌다");
		fw.write('A');
		fw.write(' ');
		char[] cArr = {'a', 'p', 'p', 'l', 'e'};
		fw.write(cArr);
		}catch(IOException e){
		e.printStackTrace();
		} 
	}
	
	
	public void fileOpen() {
		try (FileReader fr = new FileReader("b_char.txt");){
			int value;
			while((value = fr.read()) != -1){
				System.out.print((char)value + " ");
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
}
}