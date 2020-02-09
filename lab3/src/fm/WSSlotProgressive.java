package fm;

public class WSSlotProgressive extends Slot {

    public WSSlotProgressive(){
        cost = 300;
        name = "Washington Progressive";
        software = "Android";
        components.add("Large");
        components.add("Coins");
        components.add("Reels");
        components.add("ARM");
    }
    void ship() {
        System.out.println("     wrapping the slot machine in Special Wrap and shipping it with FedEx");
    }
}
