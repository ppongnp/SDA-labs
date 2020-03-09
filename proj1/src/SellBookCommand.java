public class SellBookCommand  implements InventoryCommand,java.io.Serializable {
    private Inventory inventory;
    private String name;
    private int amount;
    private int old_quantity;

    public SellBookCommand(Inventory inventory,String name,int quantity){
        this.inventory = inventory;
        this.name = name;
        this.amount = quantity;
        this.old_quantity = inventory.searchByName(name).getQuantity();
    }

    public void execute() {
        inventory.sellBook(name,amount);
    }

    public void undo() {
        inventory.searchByName(name).setQuantity(this.old_quantity);
    }
}
