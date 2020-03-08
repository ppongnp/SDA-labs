import java.util.*;
import java.io.*;

public class CareTaker implements java.io.Serializable {
    private List<Memento> mementoList = new ArrayList<Memento>();

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

            for (Memento m:mementoList) {
               out.writeObject(m);
            }

            out.close();
            file.close();
            System.out.println("Object has been serialized");

        }catch(IOException ex) {
            System.out.println("IOException is caught");
        }
    }

    public void deserialize(String filename){
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            String object_list = in.readObject().toString();
            in.close();
            file.close();

            System.out.println(object_list);

        }catch(IOException ex) {
            System.out.println("IOException is caught");
        }catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            }
        }
}
