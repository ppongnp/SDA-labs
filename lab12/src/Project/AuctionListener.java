package Project;

public class AuctionListener implements IAuctionListener {
    @Override
    public void update(Item item) {
        System.out.println(item.toString());
    }
}
