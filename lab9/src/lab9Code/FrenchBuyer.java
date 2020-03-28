package lab9Code;

public class FrenchBuyer extends Buyer {

	public FrenchBuyer(Mediator mediator) {
		super(mediator, "euro");
		this.mediator.registerFrenchBuyer(this);
	}
}
