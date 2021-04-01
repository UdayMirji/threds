package com.xworkz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWrirterAndReaderDemo {

	public static void main(String[] args) {
		System.out.println("main method satrted....");

		try {
			FileWriter fileWriter = new FileWriter("E://Movies/chichore.txt", true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.newLine();
			bufferedWriter.append("Kirayath is a song of chichore movie");
			bufferedWriter.flush();
			bufferedWriter.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

		try {
			FileReader fileReader = new FileReader("E://Movies/chichore.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			while (null != line) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Main method ends");
		}

	}
}
