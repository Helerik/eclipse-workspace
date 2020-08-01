
public class class17 {
	public static void main(String args[]) {
		tuna tunaObj = new tuna(10);
		System.out.println(tunaObj);
		
		for (int i = 0; i<5;i++) {
			tunaObj.add();
			System.out.println(tunaObj);
		}
		
		potpie pie = new potpie();
		tunaObj.eat();
		pie.eat();
	}

}
