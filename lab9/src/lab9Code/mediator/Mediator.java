package lab9Code.mediator;

public class Mediator {
    Buyer swedish;
    Buyer french;
    AmericanSeller american;
    DollarConverter dollarConverter;

    public Mediator(){}

    public void registerSwedishBuyer(SwedishBuyer buyer){
        this.swedish = buyer;
    }
    public void registerFrenchBuyer(FrenchBuyer buyer){
        this.french = buyer;
    }
    public void registerAmericanSeller(AmericanSeller seller){
        this.american = seller;
    }
    public void  registerDollarConverter(DollarConverter converter){
        this.dollarConverter = converter;
    }
    public boolean placeBid(float bid,String unitCurr){
        float amount = dollarConverter.convertCurrencyToDollars(bid,unitCurr);
        return american.isBidAccepted(amount);
    }
}
