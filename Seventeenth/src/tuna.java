
public class tuna extends food{
	private int sum;
	private final int NUMBER;
	
	public tuna(int x) {
		NUMBER = x;
	}
	public void add() {
		sum += NUMBER;
	}
	public String toString() {
		return String.format("sum = %d\n", sum);
	}
}
