package lab.AbstractFactory;

public class StraightSlot extends Slot {
    SlotComponentFactory componentFactory;
    private String type = "Straight";
    public StraightSlot(SlotComponentFactory componentFactory) {
        this.componentFactory= componentFactory;
    }

    void build() {
        System.out.println("     1. Building " + name);
        cabinet = componentFactory.createCabinet(type);
        display = componentFactory.createDisplay(type);
        payment = componentFactory.createPayment(type);
        gpu = componentFactory.createGPU(type);
        software = componentFactory.createOS(type);
    }
}
