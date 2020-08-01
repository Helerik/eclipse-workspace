import java.util.Random;

public class class11 {
	
	public static void main(String args[]) {
		int bucky[] = new int[10];
		
		bucky[0] = 87;
		bucky[1] = 543;
		bucky[9] = 10;
		
		System.out.println(bucky[1]);
		System.out.println(bucky[5]);
		System.out.println(bucky[6]);
		System.out.println(bucky[9] + "\n");
		
		int buck[] = {2,3,4,5,3,2,5,9};
		
		System.out.println(buck[4] + "\n\n");
		
		
		
		System.out.println("Index    Value");
		int tab[]= {32,12,30};
		for(int i = 0; i < tab.length; i++) {
			System.out.println(i + "        " + tab[i]);
		}
		System.out.println("\n\n");
		
		Random rand = new Random();
		int freq[] = new int[7];
		
		for(int roll = 0; roll<1000;roll++) {
			++freq[1+rand.nextInt(6)];
		}
		for(int face = 1; face<freq.length; face++) {
			System.out.println(face + "    " + freq[face]);
		}
		System.out.println("\n\n");
		
		int total = 0;
		for (int x: buck) {
			total += x;
		}
		System.out.println(total+"\n");
		
	}

}
