
import java.util.Scanner;

public class class8 {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		tuna tunaObj = new tuna("Kelsey");
		
		tunaObj.saying();
		
		System.out.println("Enter name of first gf here: ");
		
		String tmp = input.nextLine();
		tunaObj.setName(tmp);
		tunaObj.saying();
		
		input.close();
	}

}
