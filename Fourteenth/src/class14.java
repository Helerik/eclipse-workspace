
public class class14 {
	
	public static void main(String args[]) {
		tuna tunaObj = new tuna();
		tuna tunaObj1 = new tuna(5);
		tuna tunaObj2 = new tuna(5,13);
		tuna tunaObj3 = new tuna(5,13,43);
		
		System.out.println(tunaObj.toMilitary());
		System.out.println(tunaObj1.toMilitary());
		System.out.println(tunaObj2.toMilitary());
		System.out.println(tunaObj3.toMilitary());
	}

}
