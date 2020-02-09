package fm;

public class TestSlots {
	public static void main(String[] args) {

		SlotStore NVStore = new NVSlotStore();
		SlotStore NJStore = new NJSlotStore();
		SlotStore WSStore = new WSSlotStore();

		System.out.println("####### NEVADA SLOT STORE #######");
		for(slottype type: slottype.values()){
			Slot slot = NVStore.orderSlot(type);
			System.out.println("Taj Mahal ordered a "+ slot.getName());
		}
		System.out.println("#######=====#######");

		System.out.println("####### NEW JERSEY SLOT STORE #######");
		for(slottype type: slottype.values()){
			Slot slot = NJStore.orderSlot(type);
			System.out.println("Bangkok ordered a "+ slot.getName());
		}
		System.out.println("#######=====#######");

		System.out.println("####### WASHINGTON SLOT STORE #######");
		for(slottype type: slottype.values()){
			Slot slot = WSStore.orderSlot(type);
			System.out.println("Tokyo ordered a "+ slot.getName());
		}
		System.out.println("#######=====#######");

	}

}
