import java.util.Scanner;
class madhan {
		int id;
		String name; 
		
void data(int r,String n) {
	id  = r;
	name = n;
}
	
void display() {
	System.out.print(id+" "+name);
}}
	public class main{
	public static void main(String[] args) {
	 madhan m = new madhan();
	 m.data(12,"sanjay");
	 m.display();
	 }
	}
	
