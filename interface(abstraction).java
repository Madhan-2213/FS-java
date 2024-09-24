package jfs;
import java.util.*;
interface vehicle{
	void run();
	void runs();  //abstract method with no implementation
}
class Honda implements vehicle{	
	public void run() {
		System.out.println("Running.....");
	}
	public void runs() {
		System.out.println("Run safely");
	}
}
class  car implements vehicle{
	public void run() {
		System.out.println("Runningsssss.....");
	}
	public void runs() {
		System.out.println("Run safelyyyyyy.....");
	}
}


public class Main {
	public static void main(String[] args) {
		vehicle v =  new Honda();
		vehicle b = new car();
	    v.run();
	    v.runs();
	    b.run();
	    b.runs();
	}
	
}
