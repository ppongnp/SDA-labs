package lab.AbstractFactory;

public abstract class Slot {
	
	Cabinet cabinet;
	Display display;
	OS software;
	GPU gpu;
	Payment payment;
	String name;
	
	abstract void build();
	
	void collectParts() {
		System.out.println("     2. fetching components:");
	}
	void assembleParts() {
		System.out.println("     3. assembling components");
	}
	void test(String type) {
		if (type.equals("hardware")) System.out.println("     4. testing hardware");
		else System.out.println("     6. testing software");
	}
	void uploadSoftware() {
		System.out.println("     5. uploading software:" + software);
	}
	void ship() {
		System.out.println("     7. wrapping the slot machine in Ceram Wrap and shipping it with UPS\n");
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (cabinet != null) {
			result.append("     - " + cabinet);
			result.append("\n");
		}
		if (payment != null) {
			result.append("     - " + payment);
			result.append("\n");
		}
		if (display != null) {
			result.append("     - " + display);
			result.append("\n");
		}
		if (gpu != null) {
			result.append("     - " + gpu);
			result.append("\n");
		}
		if (software != null) {
			result.append("     - " + software);
		}

		return result.toString();
	}
}