package jfs;
import java.util.*;
class Animal{
	void cow() {
		System.out.println("Maaa");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.print("wao wao");
	}
}

public class Main {
	public static void main(String[] args) {
		Animal S = new Animal();
		S.cow();
		
		Dog d  = new Dog();
		d.sound();
	}
}
