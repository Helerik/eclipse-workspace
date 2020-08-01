
import java.util.EnumSet;

public class class16 {
	public static void main(String args[]) {
		for (tuna people: tuna.values()) {
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		}
		System.out.println("\n");
		
		for(tuna people: EnumSet.range(tuna.kelsey, tuna.candy)) {
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		}
		System.out.println("\n");
		
		bass members1 = new bass("Megan", "Fox");
		bass members2 = new bass("Natalie", "Portman");
		bass members3 = new bass("Taylor", "Swift");
		
		System.out.println("\n");
		System.out.println(bass.getMembers());
		System.out.println("\n");
		
		System.out.println(members1.getFirst());
		System.out.println(members1.getLast());
		System.out.println(members1.getMembers());
	}
}
