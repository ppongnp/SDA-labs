package lab.AbstractFactory;
import java.util.ArrayList;

public class SlotMachineApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> type = new ArrayList<String>();
		type.add("bonus");
		type.add("progressive");
		type.add("straight");

		SlotFactory njFactory = new NJSlotFactory();
		SlotFactory nvFactory = new NVSlotFactory();
		SlotFactory wsFactory = new WSSlotFactory();

		System.out.println("##################  NEW JERSEY  ##################");
		for(int i =0; i<3; i++){
			Slot temp = njFactory.orderSlot(type.get(i));
			System.out.println("--Taj Mahal ordered a " + temp + "\n");
		}
		System.out.println("##################################################");

		System.out.println("##################  NEVADA  ##################");
		for(int i =0; i<3; i++){
			Slot temp = nvFactory.orderSlot(type.get(i));
			System.out.println("--Pepper Mill ordered a " + temp + "\n");
		}
		System.out.println("##############################################");

		System.out.println("##################  WASHINGTON  ##################");
		for(int i =0; i<3; i++){
			Slot temp = wsFactory.orderSlot(type.get(i));
			System.out.println("--Macao ordered a " + temp + "\n");
		}
		System.out.println("##################################################");

	}

}
