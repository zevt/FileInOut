package textInOut;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo01 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter prWriter = new PrintWriter("src/textInOut/employee.txt");
		
		String name = "Harry Hacker";
		double salary = 99000;
		prWriter.print(name);
		prWriter.println("  " + salary);
		prWriter.close();
		
		File outFile = new File("src/textInOut/employee.txt");
		PrintWriter pr2;
		if (outFile.exists()) {
			System.out.println(" The file employee.txt already exists.");
			System.out.println(" Content will be extended");
			pr2 = new PrintWriter(outFile);
//			pr2.append("New line added");
			pr2.close();
		}
		
	}
}
