package Project;

import java.util.HashMap;

public class AuctionServer implements  IAuctionServer {
    private HashMap<String,Item> items = new HashMap<String,Item>();
    private static  AuctionServer uniqueServer;

    private AuctionServer(){}

    public static synchronized  AuctionServer getInstance(){
        if( uniqueServer == null){
            uniqueServer = new AuctionServer();
        }
        return uniqueServer;
    }

    @Override
    public void placeItemForBid(String ownerName, String itemName, String itemDesc, double startBid, int auctionTime) {
        items.put(itemName,new Item(ownerName,itemName,itemDesc,startBid,auctionTime));
    }

    @Override
    public void bidOnItem(String bidderName, String itemName, double bid) {
        Item target = items.get(itemName);
        if(target == null){
            System.out.println("ERROR: Item not found !");
        }else{
            target.newBid(bid,bidderName);
        }
    }

    @Override
    public HashMap<String, Item> getItems() {
        return this.items;
    }

    @Override
    public Item getItem(String itemName) {
        return this.items.get(itemName);
    }

    @Override
    public void registerListener(IAuctionListener al, String itemName) {
        this.items.get(itemName).attach(al);
    }
}
