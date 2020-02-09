package xmastree;

public class SilverBall extends TreeDecorator {

    public SilverBall(Tree tree){
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Silver Ball";
    }

    public double cost() {
        return 3 + tree.cost();
    }
}
