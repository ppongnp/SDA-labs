package lab.AbstractFactory;

public class NJSlotComponentFactory implements SlotComponentFactory {

	public Cabinet createCabinet(String type) {
		if ( type.equals( "Bonus" ) ){
			return new LargeCabinet();
		} else if ( type.equals( "Progressive" ) || type.equals( "Straight" ) ){
			return new SmallCabinet();
		} else {
			return null;
		}
	}

	public Display createDisplay(String type) {
		if ( type.equals( "Bonus" ) ){
			return new Reels();
		} else if ( type.equals( "Progressive" ) ){
			return new CRT();
		} else if ( type.equals( "Straight" ) ){
			return new LCD();
		}else{
			return null;
		}
	}

	public Payment createPayment(String type) {
		if ( type.equals( "Bonus" ) || type.equals( "Straight" ) ){
			return new Coins();
		} else if ( type.equals( "Progressive" ) ){
			return new Bills();
		}else{
			return null;
		}
	}

	public GPU createGPU(String type) {
		if ( type.equals( "Bonus" ) || type.equals( "Straight" ) ){
			return new ARM();
		} else if ( type.equals( "Progressive" ) ){
			return new X86();
		}else{
			return null;
		}
	}

	public OS createOS(String type) {
		if ( type.equals( "Bonus" ) || type.equals( "Straight" ) ){
			return new WindowsME();
		} else if ( type.equals( "Progressive" ) ){
			return new WindowsXP();
		}else{
			return null;
		}
	}
}
