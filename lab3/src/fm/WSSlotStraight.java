package fm;

public class WSSlotStraight extends Slot {

    public WSSlotStraight(){
        cost = 300;
        name = "Washington Straight";
        software = "Linux";
        components.add("Large");
        components.add("Bills");
        components.add("Reels");
        components.add("ARM");
    }

    void ship() {
        System.out.println("     wrapping the slot machine in Special Wrap and shipping it with FedEx");
    }
}
