
import java.util.Scanner;

public class class6 {
	
	public static void main(String args[]) {
		tuna tunaObj = new tuna();
		tunaObj.simpleMessage();
		
		Scanner input = new Scanner(System.in);
		bass bassObj = new bass();
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		bassObj.simpleMessage(name);
		
		input.close();
		
	}

}
