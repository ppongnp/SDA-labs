package xmastree;

public class Test_tree {
	
	public static void main(String[] args) {
		Tree mytree = new BalsamFir();
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		mytree = new BlueBall(mytree);
		mytree = new RedBall(mytree);
		mytree = new Star(mytree);
		mytree = new SilverBall(mytree);
		mytree = new Ribbon(mytree);
		mytree = new LEDS(mytree);
		mytree = new Lights(mytree);
		System.out.println(mytree.getDescription() + " costs:" +mytree.cost());
	}
}
