
public class class22 {
	
	public static void main(String args[]) {
		Animal[] thelist = new Animal[2];
		Dog d = new Dog();
		Fish s = new Fish();
		
		thelist[0] = d;
		thelist[1] = s;
		
		for (Animal x: thelist) {
			x.noise();
		}
	}
}
