import java.util.*;
import java.io.*;

public class CareTaker {
    public List<Memento> mementoList;

    public CareTaker(){
        this.mementoList = new ArrayList<Memento>();
    }

    public void add(Memento state){
        mementoList.add(state);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }

    public void saveSerialize(String filename){
        try {

            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(mementoList);
            out.close();
            file.close();
            System.out.println("Object has been serialized");

        }catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public void deserialize(String filename){
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            mementoList = (ArrayList<Memento>) in.readObject();
            in.close();
            file.close();
            System.out.println(mementoList);

        }catch(IOException ex) {
            ex.printStackTrace();
        }catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            }
        }
}
