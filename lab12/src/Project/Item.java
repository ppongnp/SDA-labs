package Project;

import java.util.ArrayList;

public class Item {
    private String ownerName;
    private String itemName;
    private String itemDesc;
    private String bidderName;
    private Double startBid;
    private Double bid;
    private int auctionTime;
    private ArrayList<IAuctionListener> Listener;

    public Item(String ownerName,String itemName,String itemDesc,Double startBid, int auctionTime){
        this.ownerName = ownerName;
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.startBid = startBid;
        this.auctionTime = auctionTime;
        this.bidderName = "None";
        this.bid = startBid;
        this.Listener = new ArrayList<IAuctionListener>();
    }

    public void attach(IAuctionListener li){
        this.Listener.add(li);
    }

    public void  detach(IAuctionListener li){
        this.Listener.remove(li);
    }

    public void notifyObserver(){
        for(IAuctionListener target:this.Listener){
            target.update(this);
        }
    }

    public void newBid(Double value,String bidderName){
        if(value > this.bid){
            setBid(value);
            setBidderName(bidderName);
            notifyObserver();
        }else{
            System.out.println("ERROR: not high value enough ! ");
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getBidderName() {
        return bidderName;
    }

    public void setBidderName(String bidderName) {
        this.bidderName = bidderName;
    }

    public Double getStartBid() {
        return startBid;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    public int getAuctionTime() {
        return auctionTime;
    }

    public void setAuctionTime(int auctionTime) {
        this.auctionTime = auctionTime;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ownerName='" + ownerName + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemDesc='" + itemDesc + '\'' +
                ", bidderName='" + bidderName + '\'' +
                ", startBid=" + startBid +
                ", bid=" + bid +
                ", auctionTime=" + auctionTime +
                '}';
    }
}
