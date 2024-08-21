package linked;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("kpr.txt");
			file.write("This is having the information of the student");
			file.write("Name:- Madhan,Age:20");
			file.write("Name:-Maddy,Age:24");
			file.close();
			System.out.println("Some Information is written into the file");
			
		}
		catch(IOException e) {
			System.out.println("Error...,");
			e.printStackTrace();
		}

	}

}
