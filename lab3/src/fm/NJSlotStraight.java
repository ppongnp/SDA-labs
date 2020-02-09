package fm;

public class NJSlotStraight extends Slot {

    public NJSlotStraight(){
        cost = 300;
        name = "New Jersey Straight";
        software = "Windows ME";
        components.add("Small");
        components.add("Coins");
        components.add("LCD");
        components.add("ARM");
    }

    void ship() {
        System.out.println("     having uncle Ted drop it off");
    }
}
