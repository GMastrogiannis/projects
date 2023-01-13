import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String lName;
		String fName;
		
		System.out.println("Εισάγετε το όνομά σας: ");
		Scanner scanner  = new Scanner(System.in);
		
		lName = scanner.nextLine();
		
		System.out.println("Εισάγετε το επώνυμό σας: ");
//		Scanner scanner  = new Scanner(System.in);
		
		fName = scanner.nextLine();
		
		System.out.println(lName +" " + fName);
		
		

	}

}
