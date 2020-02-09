package lab.AbstractFactory;

public class WSSlotComponentFactory implements SlotComponentFactory {
    public Cabinet createCabinet(String type) {
        if ( type.equals( "Bonus" ) ){
            return new MediumCabinet();
        } else if ( type.equals( "Progressive" ) || type.equals( "Straight" ) ){
            return new LargeCabinet();
        } else {
            return null;
        }
    }

    public Display createDisplay(String type) {
        if ( type.equals( "Bonus" ) ){
            return new VGA();
        } else if ( type.equals( "Progressive" ) || type.equals( "Straight" ) ){
            return new Reels();
        }else{
            return null;
        }
    }

    public Payment createPayment(String type) {
        if ( type.equals( "Bonus" ) ){
            return new TicketInAndOut();
        } else if ( type.equals( "Progressive" ) ){
            return new Coins();
        } else if ( type.equals( "Straight" ) ){
            return new Bills();
        }else{
            return null;
        }
    }

    public GPU createGPU(String type) { return new ARM();}

    public OS createOS(String type) {
        if (type.equals("Bonus")) {
            return new Symbian();
        } else if (type.equals("Progressive")) {
            return new Android();
        } else if (type.equals("Straight")) {
            return new Linux();
        } else {
            return null;
        }
    }
}
