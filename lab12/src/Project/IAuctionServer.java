package Project;
import java.util.HashMap;

public interface IAuctionServer {
    public void placeItemForBid(String ownerName, String itemName,
                                String itemDesc, double startBid, int auctionTime);
    public void bidOnItem(String bidderName, String itemName,
                          double bid);
    public HashMap getItems();
    public Item getItem(String itemName);
    public void registerListener(IAuctionListener al, String itemName);
}
