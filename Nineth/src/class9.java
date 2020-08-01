
public class class9 {
	public static void main(String args[]) {
		int age = 60;
		
		System.out.println(age > 50 ? "You are old\n" : "You are young\n");
		
		int counter = 0;
		while (counter < 10) {
			System.out.printf("Counting: %d\n", counter);
			counter += 1;
		}
		
		for (counter = 0; counter<10;counter++) {
			System.out.printf("Counting: %d\n", counter);
		}		
	}
}
