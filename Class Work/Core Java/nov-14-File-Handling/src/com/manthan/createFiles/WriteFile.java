package com.manthan.createFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		
		String msg="Hii... Ankit !!";
		byte[] by=msg.getBytes();
		
		try (FileOutputStream fout=new FileOutputStream("dhanya.txt")){
			fout.write(by);
			System.out.println("File Created and Content is added...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
