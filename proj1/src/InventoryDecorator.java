import java.io.*;
import java.util.ArrayList;

public class InventoryDecorator extends Inventory {
    public Inventory inventory;
    private ArrayList<InventoryCommand> allCommands;

    InventoryDecorator(Inventory inventory){
        this.inventory = inventory;
        this.allCommands = new ArrayList<InventoryCommand>();
    }

    public void addCommand(InventoryCommand command){
        this.allCommands.add(command);
    }
    public void saveSerialize(){
        try {
            FileOutputStream file = new FileOutputStream("allCommands.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(this.allCommands);
            out.close();
            file.close();

        }catch(IOException ex) {
            ex.printStackTrace();
        }

    }

    public void deserialize(){
        try {
            FileInputStream file = new FileInputStream("allCommands.ser");
            ObjectInputStream in = new ObjectInputStream(file);
            this.allCommands = (ArrayList<InventoryCommand>) in.readObject();
            in.close();
            file.close();
            System.out.println("decor complete");

        }catch(IOException ex) {
            ex.printStackTrace();
        }catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<InventoryCommand> getAllCommands() {
        return allCommands;
    }
}
