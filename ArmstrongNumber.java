package linked;
import java.util.Scanner;
public class ArmstrongNumber {
		static boolean isArmStrongNumber(int number) {
			String digits = Integer.toString(number);
			int numDigits = digits.length();
			int sum = 0;
			for(int i=0;i<numDigits;i++) {
				int digit = Character.getNumericValue(digits.charAt(i));
				sum +=Math.pow(digit, numDigits);
				
		}
			return sum== number;
	}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter any number");
			int number = scanner.nextInt();
			if(isArmStrongNumber(number)) {
				System.out.print(number +" is an Armstrong Number");
			}
			else {
				System.out.print(number +" is not an Armstrong number");
			}
		}

}
