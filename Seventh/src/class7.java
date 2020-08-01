
import java.util.Scanner;

public class class7 {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		tuna tunaObj = new tuna();
		System.out.println("Enter name of first gf here: ");
		
		String tmp = input.nextLine();
		tunaObj.setName(tmp);
		tunaObj.saying();
		
		input.close();
	}

}
