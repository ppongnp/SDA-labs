import java.util.*;

public class InventoryInvoker {
    private ArrayList<InventoryCommand> commands;
    private Inventory inventory;
    private CareTaker careTaker;

    public InventoryInvoker(){
        this.commands = new ArrayList<InventoryCommand>();
        this.inventory = new Inventory();
        this.careTaker = new CareTaker();
    }
    public void printcom(){
        System.out.println("inventory \n");
        this.inventory.printint();
        System.out.println("command \n");
        System.out.println(commands);
    }

    public void add_book(String name,Double price,int quantity){
        AddBookCommand cmd = new AddBookCommand(inventory,name,price,quantity);
        commands.add(cmd);
        save_to_file();
        cmd.execute();
    }

    public void remove_book(String name){
        RemoveBookCommand cmd = new RemoveBookCommand(inventory,name);
        commands.add(cmd);
        save_to_file();
        cmd.execute();
    }

    public void add_book_copies(String name,int quantity){
        AddCopiesCommand cmd = new AddCopiesCommand(inventory,name,quantity);
        commands.add(cmd);
        save_to_file();
        cmd.execute();
    }

    public void change_book_price(String name,Double price){
        ChangePriceCommand cmd = new ChangePriceCommand(inventory,name,price);
        commands.add(cmd);
        save_to_file();
        cmd.execute();
    }

    public void undo_current_cmd(){
        InventoryCommand tmp = (InventoryCommand) commands.get(commands.size()-1);
        commands.remove(commands.size()-1);
        tmp.undo();
        save_to_file();
    }


    public void save_to_file(){
        String filename = "File.ser";
        Memento temp = new Memento(inventory.getBook_list(),this.commands);
        careTaker.add(temp);
        careTaker.saveSerialize(filename);
    }
    public void load_from_file(){
        String filename = "File.ser";
        careTaker.deserialize(filename);
        Memento current = careTaker.get(careTaker.mementoList.size()- 1);
        this.inventory.getBookListFromMemento(current);
        load_command(current);
    }

    public void load_command(Memento temp){
        this.commands = temp.getCommand_list();
    }
}
