package co.grandcircus.midterm;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileLinesHelper {

private Path filePath = Paths.get("starbucks.txt");
	
	public FileLinesHelper(Path filePath) {
		this.filePath = filePath;
	}
	
	public FileLinesHelper(String filePath) {
		this(Paths.get(filePath));
	}
	
	public List<String> readFile() {
		try {
			return Files.readAllLines(filePath);
		} catch (FileNotFoundException ex) {
			return new ArrayList<>();
		} catch (IOException ex) {
			ex.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	public void appendToFile(String line) throws IOException {
		ensureFileExists();
		List<String> linesToAdd = Arrays.asList(line);

		Files.write(filePath, linesToAdd, StandardOpenOption.APPEND);
	}
	
	public void rewriteFile(List<String> lines) throws IOException {
		ensureFileExists();
		
		Files.write(filePath, lines, StandardOpenOption.TRUNCATE_EXISTING);
	}
	
	private void ensureFileExists() throws IOException {
		if ( Files.notExists(filePath) ) {
			Files.createFile(filePath);
		}
	}
	
	public void clearFile() throws IOException {
		rewriteFile(Collections.emptyList());
	}
}
