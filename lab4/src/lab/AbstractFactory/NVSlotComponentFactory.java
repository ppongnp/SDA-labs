package lab.AbstractFactory;

public class NVSlotComponentFactory implements SlotComponentFactory {

	public Cabinet createCabinet(String type) {
		if ( type.equals( "Bonus" ) ){
			return new SmallCabinet();
		} else if ( type.equals( "Progressive" ) ){
			return new MediumCabinet();
		} else if ( type.equals( "Straight" ) ){
			return new LargeCabinet();
		}else{
			return null;
		}
	}

	public Display createDisplay(String type) {
		if ( type.equals( "Bonus" ) ){
			return new CRT();
		} else if ( type.equals( "Progressive" ) ){
			return new LCD();
		} else if ( type.equals( "Straight" ) ){
			return new Reels();
		}else{
			return null;
		}
	}

	public Payment createPayment(String type) { return new TicketInAndOut();}

	public GPU createGPU(String type) {
		if ( type.equals( "Bonus" ) ){
			return new X86();
		} else if ( type.equals( "Progressive" ) ){
			return new X77();
		} else if ( type.equals( "Straight" ) ){
			return new ARM();
		}else{
			return null;
		}
	}

	public OS createOS(String type) {
		if ( type.equals( "Bonus" ) || type.equals( "Straight" ) ){
			return new Linux();
		} else if ( type.equals( "Progressive" ) ){
			return new Android();
		}else{
			return null;
		}
	}

}
