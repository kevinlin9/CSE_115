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
	public static void main(String[] args) {
		try {
			hi();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
