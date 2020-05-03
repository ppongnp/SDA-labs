package Project;

public class AuctionServerFactory extends AbstractServerFactory {

    @Override
    IAuctionServer getServer() {
        return AuctionServer.getInstance();
    }
}
