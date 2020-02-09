package fm;

public class WSSlotBonus extends Slot {

    public WSSlotBonus(){
        cost = 300;
        name = "Washington Bonus";
        software = "Symbian";
        components.add("Medium");
        components.add("Ticketinticketout");
        components.add("VGA");
        components.add("ARM");
    }

    void ship() {
        System.out.println("     wrapping the slot machine in Special Wrap and shipping it with FedEx");
    }
}
