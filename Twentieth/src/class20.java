
public class class20 {
	
	public static void main(String args[]){
		
		food obj[] = new food[2];
		obj[0] = new bass();
		obj[1] = new tuna();
		
		for (food x: obj) {
			x.eat();
		}
		
		System.out.println("\n");
		
		fatty bucky = new fatty();
		// food fo = new food(); //
		food ba = new bass();
		
		// bucky.digest(fo); //
		bucky.digest(ba);
		
	}

}
