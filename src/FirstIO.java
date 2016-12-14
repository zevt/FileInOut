
import java.io.File;

public class FirstIO {
	static void p(String exp) {
		System.out.println(exp);
	}

	public static void main(String[] args) {

		// File f1 = new File("java/COPYRIGHT");
		File f1 = new File("java/COPYRIGHT/the-file-name.txt");
		p("File Name: " + f1.getName());
		p("Path: " + f1.getPath());
		p("Abs Path: " + f1.getAbsolutePath());
		p("Parent: " + f1.getParent());
		p(f1.exists() ? "exists" : "does not exist");

	}
}
