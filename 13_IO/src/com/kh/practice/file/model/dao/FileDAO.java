package com.kh.practice.file.model.dao;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		
		try(FileReader fr = new FileReader(file);){
				return true;
		
		} catch (IOException e) {
			return false;
		} 
		
	}
	
	public void fileSave(String file, String s) {
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(s);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public StringBuilder fileOpen(String file) {
//		StringBuilder sb = new StringBuilder();
//		
//		try {
//			FileReader fr = new FileReader(file);
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//	}
	
	public void fileEdit(String file, String s) {
		fileSave(file,s);
		
	}

}
