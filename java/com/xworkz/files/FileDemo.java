package com.xworkz.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File file = new File("E://Movies");
		System.out.println("is movie folder is exit  " + file.exists());
		file.mkdir();
		System.out.println("is movie folder is exit " + file.exists());

		File chichoreFile = new File("E://Movies/chichore.txt");
		try {
			chichoreFile.createNewFile();
		} catch (IOException e) {

			
			e.printStackTrace();
		}
		System.out.println("is file chichire exits : " + chichoreFile);

		try {
			FileWriter fileWriter = new FileWriter(chichoreFile);
			fileWriter.write("Hero of the movie is Shushant");
			fileWriter.write('\n');
			fileWriter.write("Heroien of the movie is Shradda");
			fileWriter.write('\n');
			fileWriter.write("Its a Hindi Movie");
			fileWriter.flush();
			fileWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			FileReader fileReader = new FileReader(chichoreFile);
			int ch = fileReader.read();
			System.out.println("contetnt of the file is :");
			while (-1 != ch) {
				System.out.print((char) ch);
				ch = fileReader.read();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
