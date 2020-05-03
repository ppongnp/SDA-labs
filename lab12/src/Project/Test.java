package Project;
import java.util.*;


public class Test {
    public static void main(String[] args){
        AbstractServerFactory factory = new AuctionServerFactory();
        IAuctionServer server = factory.getServer();
        Scanner sc = new Scanner(System.in);

        server.placeItemForBid("Henry T.","An old Vase",
                                "A vase with 100 years old",100,10);
        server.placeItemForBid("David W.","A modern painting",
                                "A good looking painting",75,10);
        server.placeItemForBid("John A.","An ancient spear",
                                "Ancient spear of the Roman",200,10);

        server.registerListener(new AuctionListener(),"An old Vase");
        boolean run = true;
        while (run){
            System.out.println("-----  Welcome to Auction server of bidding system ------");
            System.out.println("### Press 1 to place item for bidding ");
            System.out.println("### Press 2 to bid on the item ");
            System.out.println("### Press 3 to list all item on the bidding server ");
            System.out.println("### Press 4 to find the specific item ");
            System.out.println("### Press 5 to add client into the specific item for bidding ");
            System.out.println("### Press 6 to exit ");

            String choice = sc.nextLine();
            if(choice.equals("1")){
               System.out.println("==== Please enter the owner name ");
               String name = sc.nextLine();
               System.out.println("==== Please enter the product name ");
               String product = sc.nextLine();
               System.out.println("==== Please write some description of the product ");
               String desc = sc.nextLine();
               System.out.println("==== Please enter the bidding price ");
               double price = sc.nextDouble();
               server.placeItemForBid(name,product,desc,price,10);
               System.out.println("==== Successfully added item. Your item is");
               System.out.println(server.getItem(product));

            }
            else if(choice.equals("2")){
                System.out.println("==== Please enter the bidder name ");
                String name = sc.nextLine();
                System.out.println("==== Please enter the target product ");
                String product = sc.nextLine();
                System.out.println("==== Please enter the desire value ");
                double price = sc.nextDouble();
                server.bidOnItem(name,product,price);
            }
            else if(choice.equals("3")){
                System.out.println("==== All the item are \n");
                HashMap<String,Item> items = server.getItems();
                Iterator hmIterator = items.entrySet().iterator();
                while (hmIterator.hasNext()) {
                    Map.Entry mapElement = (Map.Entry)hmIterator.next();
                    System.out.println(mapElement.getValue().toString());
                }
                System.out.println("===========\n");
            }
            else if(choice.equals("4")){
                System.out.println("==== Please enter the target product ");
                String product = sc.nextLine();
                System.out.println(server.getItem(product));
            }
            else if(choice.equals("5")){
                System.out.println("==== Please enter the target product ");
                String product = sc.nextLine();
                server.registerListener(new AuctionListener(),product);
                System.out.println("==== Successfully added the new listener \n");
            }
            else if(choice.equals("6")){
                System.out.println("----- GOODBYE -----");
                run = false;
            }
        }

    }
}
