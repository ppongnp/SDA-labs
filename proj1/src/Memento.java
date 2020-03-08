import java.util.*;

public class Memento implements java.io.Serializable{
    public ArrayList<Book> book_list;

    public Memento(ArrayList<Book> list){
        this.book_list = list;
    }

    public ArrayList<Book> getBook_list() {
        return book_list;
    }
}
