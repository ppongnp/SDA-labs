package xmastree;

public class BlueBall extends TreeDecorator {

    public BlueBall(Tree tree){
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Blue Ball";
    }

    public double cost() {
        return 2 + tree.cost();
    }
}
