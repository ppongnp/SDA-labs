import java.io.File;
import java.util.*;

public class InventoryInvoker {
    private ArrayList<InventoryCommand> commands;
    private Inventory inventory;
    private CareTaker careTaker;
    private InventoryDecorator decorator;

    public InventoryInvoker(){
        this.commands = new ArrayList<InventoryCommand>();
        this.inventory = new Inventory();
        this.careTaker = new CareTaker();
        this.decorator = new InventoryDecorator(this.inventory);
    }

    public void add_book(String name,Double price,int quantity){
        AddBookCommand cmd = new AddBookCommand(inventory,name,price,quantity);
        commands.add(cmd);
        cmd.execute();
        processing_command(cmd);
    }

    public void remove_book(String name){
        RemoveBookCommand cmd = new RemoveBookCommand(inventory,name);
        commands.add(cmd);
        cmd.execute();
        processing_command(cmd);
    }

    public void add_book_copies(String name,int quantity){
        AddCopiesCommand cmd = new AddCopiesCommand(inventory,name,quantity);
        commands.add(cmd);
        cmd.execute();
        processing_command(cmd);
    }

    public void change_book_price(String name,Double price){
        ChangePriceCommand cmd = new ChangePriceCommand(inventory,name,price);
        commands.add(cmd);
        cmd.execute();
        processing_command(cmd);

    }
    public void list_all_book(){
        this.inventory.listAllBook();
    }

    public void undo_current_cmd(){
        InventoryCommand tmp = (InventoryCommand) commands.get(commands.size()-1);
        tmp.undo();
        commands.remove(commands.size()-1);
    }

    public void processing_command(InventoryCommand cmd){
        this.decorator.addCommand(cmd);
        save_commandLog_to_file();
    }

    public void save_inventory_to_file(){
        String filename = "Inventory.ser";
        Memento temp = new Memento(inventory.getBook_list());
        careTaker.add_book_memento(temp);
        careTaker.saveInventory(filename);
        this.decorator.saveSerialize();
        this.commands.clear();
        File file = new File("CommandLog.ser");
        file.delete();
        save_commandLog_to_file();
        System.out.println("=== Saved successfully! ");

    }
    public void save_commandLog_to_file(){
        String filename = "CommandLog.ser";
        CommandLog temp = new CommandLog(this.commands);
        careTaker.add_command_log(temp);
        careTaker.saveCommand(filename);
    }

    public void list_all_command(){
        ArrayList<InventoryCommand> temp = this.decorator.getAllCommands();
        for(InventoryCommand c:temp){
            System.out.println("  " + c);
        }
    }
    public void load_inventory_from_file(){
        String filename = "Inventory.ser";
        careTaker.deserializeInventory(filename);
        Memento current = careTaker.get_book_memento(careTaker.mementoList.size()- 1);
        this.inventory.getBookListFromMemento(current);
    }

    public void run_remaining_command(){
        if(!commands.isEmpty()){
            for(InventoryCommand m : commands){
                m.execute();
                this.decorator.addCommand(m);
            }
        }
    }

    public void load_command_form_file(){
        String filename = "CommandLog.ser";
        careTaker.deserializeCommand(filename);
        CommandLog command = careTaker.get_command_log(careTaker.commandList.size()-1);
        this.commands = command.getCommandList();
    }
}
