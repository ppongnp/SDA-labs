package lab9Code.mediator;

public class FrenchBuyer extends Buyer {

	public FrenchBuyer(Mediator mediator) {
		super(mediator, "euro");
		this.mediator.registerFrenchBuyer(this);
	}
}
