import java.util.Scanner;
public class TotalMark
{
	public static void main(String[] args) {
	    Scanner se= new Scanner(System.in);
	    String Name;
	    String Dept;
	    int Java;
	    int python;
	    int dbms;
	    int total_mark;
	    System.out.print("Enter name:");
	    Name = se.nextLine();
	    
	     System.out.print("Enter Dept:");
	     Dept = se.nextLine();
	    
	     System.out.print("Enter Java:");
	     Java= se.nextInt();
	     
	     System.out.print("Enter python:");
	     python = se.nextInt();
	     
	     System.out.print("Enter dbms:");
	     dbms = se.nextInt();
	     
	     System.out.print("Enter Total Mark:");
	     total_mark =Java+python+dbms;
	     
	     System.out.print(total_mark);
	     
	}
}
