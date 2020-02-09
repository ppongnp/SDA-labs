package xmastree;

public class RedBall  extends  TreeDecorator{

    public RedBall(Tree tree){
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Red Ball";
    }

    public double cost() {
        return 1 + tree.cost();
    }
}
