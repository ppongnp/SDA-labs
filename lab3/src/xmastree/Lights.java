package xmastree;

public class Lights extends TreeDecorator {

    public Lights(Tree tree){
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Light";
    }

    public double cost() {
        return 5 + tree.cost();
    }
}
