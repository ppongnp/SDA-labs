package lect6Code.adapter;

public class WildTurkey implements Turkey {
	public void gobble() {
		System.out.println("Wild Turkey: Gobble gobble");
	}
 
	public void fly() {
		System.out.println("Wild Turkey: I'm flying a short distance");
	}
}
