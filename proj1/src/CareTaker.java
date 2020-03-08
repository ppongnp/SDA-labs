import java.util.*;
import java.io.*;

public class CareTaker {
    public ArrayList<Memento> mementoList;
    public ArrayList<CommandLog> commandList;

    public CareTaker(){
        this.mementoList = new ArrayList<Memento>();
        this.commandList = new ArrayList<CommandLog>();
    }

    public void add_book_memento(Memento state){
        mementoList.add(state);
    }
    public void add_command_log(CommandLog log){commandList.add(log); }
    public Memento get_book_memento(int index){
        return mementoList.get(index);
    }
    public CommandLog get_command_log(int index) { return commandList.get(index); }
    public void saveInventory(String filename){
        saveSerialize(mementoList,filename);

    }

    public void saveCommand(String filename){
        saveSerialize(commandList,filename);
    }

    private void saveSerialize(ArrayList list,String filename){
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(list);
            out.close();
            file.close();

        }catch(IOException ex) {
            ex.printStackTrace();
        }

    }

    public void  deserializeCommand(String filename){
        this.commandList = deserialize(filename);
    }

    public void deserializeInventory(String filename){
        this.mementoList = deserialize(filename);
    }

    public ArrayList deserialize(String filename){
        try {

            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            ArrayList list = (ArrayList) in.readObject();
            in.close();
            file.close();
            return list;

        }catch(IOException ex) {
            ex.printStackTrace();
        }catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
