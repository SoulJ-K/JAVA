package com.kh.example.chap01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		try(FileInputStream fis = new FileInputStream("a_byte.txt");) {
//			while (fis.read() != -1) {
//				System.out.print((char)fis.read() + " ");
//			}
			int value;
			while((value = fis.read()) != -1) {
				System.out.print((char)value + " ");
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileSave() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("a_byte.txt");
			
			//write(int b) : void
			fos.write(97);
			
			//write(byte[] b) : void
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			//              b   c   d    e    f    g
			
			fos.write(bArr);
			
			fos.write(bArr, 1, 3);
			//        배열    , 앞에 있는 배열의 1인덱스부터 3개
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
