
import java.util.Scanner;

public class class2 {
	
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		double fnum, snum, ans;
		System.out.println("Enter first number:");
		fnum = inp.nextDouble();
		System.out.println("Enter second number:");
		snum = inp.nextDouble();
		ans = fnum + snum;
		System.out.println(ans);
	}

}
