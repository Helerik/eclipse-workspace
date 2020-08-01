import java.util.Random;

public class class10 {
	
	public static void main(String args[]) {
		double amount;
		double principal = 10000;
		double rate = .01;
		
		for(int i = 1; i <= 20; i++) {
			amount = principal*Math.pow(1 + rate, i);
			System.out.println(i + "   " + amount);
		}
		
		System.out.println(Math.abs(-10));
		System.out.println(Math.ceil(8.1));
		System.out.println(Math.floor(8.1));
		System.out.println(Math.max(10, 5));
		System.out.println(Math.min(10,-1));
		System.out.println(Math.pow(2, 10));
		System.out.println(Math.sqrt(2) + "\n");
		
		Random dice = new Random();
		int num;
		double sum = 0;
		int N = 100000;
		
		for (int i = 0; i<N; i++) {
			num = 1 + dice.nextInt(6);
			sum += num;
			System.out.println(num);
		}
		System.out.println("\n" + sum/N);
	}

}
