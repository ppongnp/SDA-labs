public class AddCopiesCommand implements InventoryCommand,java.io.Serializable{
    private Inventory inventory;
    private String name;
    private int quantity;

    public AddCopiesCommand(Inventory inventory,String name,int quantity){
        this.inventory = inventory;
        this.name = name;
        this.quantity = quantity;
    }

    public void execute(){
        inventory.addBookCopiesByName(name,quantity);
    }

    @Override
    public void undo() {
        inventory.searchByName(name).setQuantity(inventory.searchByName(name).getQuantity() - quantity);
    }
}
