package com.kh.example.chap03_assist.part01_buffer.model.vo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDAO {
	public void output() {
		try(FileWriter fw = new FileWriter("c_buffer.txt");
				BufferedWriter bw = new BufferedWriter(fw);) {
			
			//이 자체로도 데이터를 출력(저장)할 수 있음
			//하지만 여기에 성능향상을 시키고 싶어서 보조스트림을 달 예정임
			//성능향상과 관련된 보조스트림은 Buffered~ 인데
			//종류가 4가지  ==>  BufferedInputStream
			//				BufferedReader
			//				BufferedOutputStream
			//				BufferedWriter
			//이 중 지금은 무엇을 써야하는가?   ---> BufferedWriter  -- 기반스트림과 같은걸 해야함.
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			bw.write("저리가세요\n");
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void input() {
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));) {
//			FileReader fr = new FileReader("c_buffer.txt");
//			BufferedReader br = new BufferedReader(fr);
			
			String value;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
