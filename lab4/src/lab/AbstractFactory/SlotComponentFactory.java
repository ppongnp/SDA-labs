package lab.AbstractFactory;

public interface SlotComponentFactory {
	public Cabinet createCabinet(String type);
    public Display createDisplay(String type);
    public Payment createPayment(String type);
	public GPU  createGPU(String type);
	public OS createOS(String type);
}
