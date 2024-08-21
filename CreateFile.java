package linked;
import java.io.File;
import java.io.IOException;
public class CreateFile {
	public static void main(String[] args) {
		try {
			File myObj = new File("kpr.txt");
			if(myObj.createNewFile()) {
				System.out.print("Files is Created:"+ myObj.getName());
			}
			else {
				System.out.println("File is not created");
			}
		}
	
	catch(IOException e) {
		System.out.println("Error");
		e.printStackTrace();
	}

}
}
