package xmastree;

public class LEDS extends TreeDecorator {

    public LEDS(Tree tree){
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", LEDS";
    }

    public double cost() {
        return 10 + tree.cost();
    }
}
