//private access modifier
//file1:
package package1;
import package2.*;
public class main1 {
	public static void main(String[] args) {
		main2 s =new main2(); 
		s.pack2();
	}
}

//file2:
package package2;
public class main2 {
		public void pack1() {
			System.out.print("hiii.,,");
		}
		public void pack2() {
			pack1();
		}
}
