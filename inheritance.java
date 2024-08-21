package linked; 

public class Main {
	public static void main(String[] args)
	{
		Dog dog = new Dog("Buddy");
		Cat cat = new Cat("whiskers");
		System.out.println(dog.name + " says:");
		dog.sound();
		System.out.println(cat.name + " says:");
	}
}

class Animal{
	String name;
	public Animal(String name) {
		this.name = name;
	}
	public void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal{
	public   Dog(String name) {
		super(name);
	}
	@Override
	public void sound() {
		System.out.println("Woof");
	}
}
class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}

	public void sound() {
		System.out.println("Meow");
	}
}
