
public class class12 {
	
	public static void main(String args[]) {
		int bucky[] = {1,2,3,4,5,6,7};
		change(bucky);
		for(int x: bucky) {
			System.out.println(x);
		}
		System.out.println("\n\n");
		
		int ident[][]= 
			{{1,0},
			 {0,1}};
		System.out.println(ident[1][1]);
		
		System.out.println("\n\n");
		
		display(ident);
		
		System.out.println("\n\n");
		
		System.out.println(average(43, 45, 46));
		
	}
	
	public static void change(int x[]) {
		for (int i = 0; i < x.length; i++) {
			x[i] += 7;
		}
	}
	
	public static void display(int x[][]) {
		for(int row[]: x) {
			for(int column: row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}
	
	public static double average(int...numbers) {
		double total = 0;
		for (int x:numbers) {
			total+=x;
		}
		return total/numbers.length;
	}
}
