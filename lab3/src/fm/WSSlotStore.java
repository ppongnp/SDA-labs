package fm;

public class WSSlotStore extends SlotStore {

    protected Slot makeSlot(slottype type) {
        Slot tmp = null;
        if (type.equals(slottype.progressive)) {
            tmp = new WSSlotProgressive();
            tmp.cost=(float) (tmp.cost*1.2);
        }
        else if (type.equals((slottype.bonus))){
            tmp = new WSSlotBonus();
            tmp.cost = (float)(tmp.cost*1.7);
        }
        else if (type.equals((slottype.straight))){
            tmp = new WSSlotStraight();
        }
        return tmp;
    }
}
