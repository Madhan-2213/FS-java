package animal;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		//decimal to binary
	    int a=10;
		System.out.print(Integer.toBinaryString(a));
		
		//binary to decimal
		int b = 1010;
		String bb = Integer.toString(b);
		System.out.print(Integer.parseInt(bb,2));
		
		//decimal to octal
		int c = 45;
		System.out.print(Integer.toOctalString(c));
		
		//octal to decimal
		int d = 55;
		String od = Integer.toString(d);
		System.out.print(Integer.parseInt(od,8));
		
		//decimal to hexadecimal
		
		int e = 1234;
		System.out.println(Integer.toHexString(e));
		
		//hexa to dec
		
		String f = "4d2";
		System.out.print(Integer.parseInt(f,16));
			
	}}



	
