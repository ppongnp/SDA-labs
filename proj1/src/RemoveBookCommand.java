public class RemoveBookCommand implements InventoryCommand {

    private Inventory inventory;
    private String name;
    private Book current;

    public RemoveBookCommand(Inventory inventory,String name){
        this.inventory = inventory;
        this.name = name;
        this.current = inventory.searchByName(name);
    }

    public void execute() {
        inventory.removeBook(name);
    }

    public void undo() {
        inventory.addBook(current.getBook_name(),current.getPrice(),current.getQuantity());
    }
}
