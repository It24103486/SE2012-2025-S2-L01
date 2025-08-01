import java.util.Scanner;
public class Welcome{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter your first name:");
	String firstname = scanner.nextLine();
	scanner.nextLine();
	
	System.out.print("Enter your Last name:");
	String Lastname = scanner.nextLine();
	
	System.out.println("Welcome to the Second Year "  + " " + firstname +" " + Lastname);
}
}
	
