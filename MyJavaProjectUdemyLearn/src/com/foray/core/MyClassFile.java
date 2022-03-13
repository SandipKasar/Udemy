package com.foray.core;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyClassFile {

	public static void main(String[] args) {
		//FOR CREATING DIRECTORY STRUCTURE
		String dirPath="Folder"+File.separator+"Another Folder";
		File dir=new File(dirPath);
		
		if(!dir.exists()) {
			dir.mkdirs();
		}
				
				
		File file = new File(dirPath+File.separator+"MyFile.txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.canWrite());
		/*
		 * try { FileWriter fw=new FileWriter(file); fw.write("First Line"); fw.flush();
		 * fw.close(); } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * try { FileReader fr=new FileReader(file); int i; while((i=fr.read()) != -1) {
		 * System.out.println((char) i);
		 * 
		 * } } catch (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */

		try {
			FileOutputStream os = new FileOutputStream(file);
			String str = "Second line";
			os.write(str.getBytes());
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			FileInputStream is = new FileInputStream(file);

			int i;
			while ((i = is.read()) != -1) {
				System.out.println((char) i);
			}
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//file.delete();

	}
}
