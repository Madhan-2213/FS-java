import java.util.Scanner;
public class Reversenumber {
public static void main(String[] args) {
	Scanner se = new Scanner(System.in);
	int number = se.nextInt();
	do {
		System.out.println(number);
		number--;
	}	
	while(number>0);
	
}
}
