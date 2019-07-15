package co.grandcircus.midterm;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class StarbucksTextFile {
	

	private static Path filePath = Paths.get("starbucks.txt");
	
	public static void printFile() throws IOException {
        List<String> lines = Files.readAllLines(filePath);
        for (String thisLine : lines) {
            System.out.println(thisLine);
        }
    } 

    public static void appendToFile(Menu menu) throws IOException {
        if (Files.notExists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                System.out.println("Sorry, that's not a valid item, try again.");
            }
        }
        List<String> menuItems = Arrays.asList(menu.toString());
        
        Files.write(filePath, menuItems, StandardOpenOption.APPEND);

}

}
