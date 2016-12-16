package applications;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ReadLineRecord {
	private static String FileName = "src/applications/employee.txt";
	public static void main(String[] args) throws IOException {
		// If file name doens't exist then write data to FileName
		// Otherwise read data from it and display on console
		File file = new File(FileName);
		if (file.exists()) {
			Scanner sc = new Scanner(file);
			String line;
			while (sc.hasNextLine()) {
				line  = sc.nextLine();
				String[] tokens = line.split("\\|");
				String name = tokens[0];
				
				double salary = Double.parseDouble(tokens[1]);
				int y = Integer.parseInt(tokens[2]);
				int m = Integer.parseInt(tokens[3]);
				int d = Integer.parseInt(tokens[4]);
				GregorianCalendar calendar = new GregorianCalendar(y, m - 1, d);
				GregorianCalendar hiringDay = calendar;
				Employee employee = new Employee(name, salary, hiringDay);
				System.out.println(employee);
			}
			sc.close();
		} else {
			GregorianCalendar calendar = new GregorianCalendar();
//			Calendar calendar = Calendar.getInstance();
			calendar.set(2011, 0, 1);
			
			PrintWriter out = new PrintWriter(FileName);
			
			Employee hacker = new Employee("Hacker", 99000, calendar); 
			out.println(hacker);
			out.close();
			System.out.println(" Finish writing to file");
		}
	}

}
