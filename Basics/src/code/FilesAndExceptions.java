package code;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesAndExceptions {
	public static void hi() throws IOException {
		String filename = "src/code/FilesAndExceptionsTest.txt";
		for(String line : Files.readAllLines(Paths.get(filename)))
			System.out.println(line);
	}
	public static void writeToFile(String text) throws IOException{
		String filename = "src/code/FilesAndExceptionsTest.txt";
		Files.write(Paths.get(filename), text.getBytes());
	}
	public static void main(String[] args) {
		try {
			hi();
			writeToFile("I've been written in again! Wait was this the first time?");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
