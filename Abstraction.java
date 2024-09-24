// Abstraction
package jfs;
import java.util.*;
abstract class vehicle{ //we use super class
	abstract void run() ;   //abstract method
}
class Honda extends vehicle{
	void run() {
		System.out.print("Running safety"); //concrete method
	}
}

public class Main {
	public static void main(String[] args) {
		vehicle v =  new Honda(); //super keyword at method
	    v.run();  //object
	}
	
}
