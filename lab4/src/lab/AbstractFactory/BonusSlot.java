package lab.AbstractFactory;
public class BonusSlot extends Slot {
	SlotComponentFactory componentFactory;
	String type = "Bonus";
	public BonusSlot(SlotComponentFactory componentFactory) {
		this.componentFactory= componentFactory;
	}

	void build() {
		System.out.println("     1. Building " + name);
		cabinet = componentFactory.createCabinet(type);
		payment = componentFactory.createPayment(type);
		display = componentFactory.createDisplay(type);
		gpu = componentFactory.createGPU(type);
		software = componentFactory.createOS(type);
	}
}
