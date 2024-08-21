package linked;

public class persons {
	private String name;
	private int age;
	public persons(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void set(int age) {
		if(age>0) {
			this.age = age;
		}
		else {
			System.out.print("Invalid age");
		}
	}

	}
public class person{
	public static void main(String[] args) {
		persons person1 = new persons("Alice",30);
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
	}
	
}
		

	


