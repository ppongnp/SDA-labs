package xmastree;

public class Ribbon extends TreeDecorator {
    public Ribbon(Tree tree){
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Ribbon";
    }

    public double cost() {
        return 2 + tree.cost();
    }
}
