package jfsd1;

class phone{
	phone(){
		System.out.println("Super class called here.......");
	}
	void makecall(){
		System.out.print("Class calling......");
	}
}
class Buttonphone extends phone{
	Buttonphone(){
		super();//it refers parent class
	}
	void pressbutton() {
		this.makecall();
	}
}
public class main {
	public static void main(String[] args) {
		Buttonphone b = new Buttonphone();
		b.pressbutton();
	}
}
