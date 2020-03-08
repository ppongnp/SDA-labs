import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
    public void printcom(){
        System.out.println("inventory \n");
        this.inventory.printint();
        System.out.println("all command\n");
        this.decorator.deserialize();
        System.out.println(this.decorator.getAllCommands());
        System.out.println("command Log\n");
        System.out.println(commands);
    }

    public void add_book(String name,Double price,int quantity){
        AddBookCommand cmd = new AddBookCommand(inventory,name,price,quantity);
        commands.add(cmd);
        processing_command(cmd);
        cmd.execute();
    }

    public void remove_book(String name){
        RemoveBookCommand cmd = new RemoveBookCommand(inventory,name);
        commands.add(cmd);
        processing_command(cmd);
        cmd.execute();
    }

    public void add_book_copies(String name,int quantity){
        AddCopiesCommand cmd = new AddCopiesCommand(inventory,name,quantity);
        commands.add(cmd);
        processing_command(cmd);
        cmd.execute();
    }

    public void change_book_price(String name,Double price){
        ChangePriceCommand cmd = new ChangePriceCommand(inventory,name,price);
        commands.add(cmd);
        processing_command(cmd);
        cmd.execute();

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

        try{
            new FileOutputStream("CommandLog.ser").close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException t){
            t.printStackTrace();
        }

    }
    public void save_commandLog_to_file(){
        String filename = "CommandLog.ser";
        CommandLog temp = new CommandLog(this.commands);
        careTaker.add_command_log(temp);
        careTaker.saveCommand(filename);
    }
    public void load_inventory_from_file(){
        String filename = "Inventory.ser";
        careTaker.deserializeInventory(filename);
        Memento current = careTaker.get_book_memento(careTaker.mementoList.size()- 1);
        this.inventory.getBookListFromMemento(current);
    }

    public void load_command_form_file(){
        String filename = "CommandLog.ser";
        careTaker.deserializeCommand(filename);
        CommandLog command = careTaker.get_command_log(careTaker.commandList.size()-1);
        this.commands = command.getCommandList();
    }
}
