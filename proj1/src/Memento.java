import java.util.*;

public class Memento implements java.io.Serializable{
    public ArrayList<Book> book_list;
    public ArrayList<InventoryCommand> command_list;

    public Memento(ArrayList<Book> list,ArrayList<InventoryCommand> comm_list){
        this.book_list = list;
        this.command_list = comm_list;
    }

    public ArrayList<Book> getBook_list() {
        return book_list;
    }
    public ArrayList<InventoryCommand> getCommand_list(){ return command_list; }
}
