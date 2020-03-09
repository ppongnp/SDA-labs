public class ChangePriceCommand implements InventoryCommand,java.io.Serializable {
    private Inventory inventory;
    private String name;
    private Double price;
    private Double oldprice;

    public ChangePriceCommand(Inventory inventory,String name,Double price){
        this.inventory = inventory;
        this.name = name;
        this.price = price;
        this.oldprice = inventory.searchByName(name).getPrice();
    }

    public void execute(){
        inventory.changeBookPrice(name,price);
    }

    public void undo() {
        inventory.searchByName(name).setPrice(oldprice);
    }
}
