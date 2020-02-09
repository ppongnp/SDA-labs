package fm;

public class NJSlotBonus extends Slot {

    public NJSlotBonus(){
        cost = 300;
        name = "New Jersey Bonus";
        software = "WindowsME";
        components.add("Large");
        components.add("Coins");
        components.add("Reels");
        components.add("ARM");
    }

    void ship() { System.out.println("     having uncle Jeff drop it off");}
}
