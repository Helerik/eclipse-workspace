
public class class13 {
	
	public static void main(String args[]) {
		tuna tunaObj = new tuna();
		System.out.println(tunaObj.toMilitary());
		
		tunaObj.setTime(14, 25, 6);
		System.out.println(tunaObj.toMilitary());
		
		System.out.println(tunaObj.toNormal());
	}
	
}
