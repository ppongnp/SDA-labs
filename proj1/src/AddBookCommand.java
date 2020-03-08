public class AddBookCommand implements InventoryCommand,java.io.Serializable{

    private Inventory inventory;
    private String name;
    private Double price;
    private int quantity;

    public AddBookCommand(Inventory inventory,String name,Double price,int quantity){
        this.inventory = inventory;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void execute() {
        inventory.addBook(name,price,quantity);
    }

    public void undo() {
        inventory.removeBook(name);
    }
}
