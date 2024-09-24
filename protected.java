//protected
//file-1:
package package1;
import package2.*;
public class main1 extends main2{
	public static void main(String[] args) {
		main1 s =new main1(); 
		s.pack1();
	}
}
//file-2:
package package2;
public class main2 {
		protected void pack1() {
			System.out.print("hiii.,,");
		}
		
}
