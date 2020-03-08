import java.util.*;

public class Memento {
    public ArrayList<Book> book_list;

    public Memento(ArrayList<Book> list){
        this.book_list = list;
    }

    public ArrayList<Book> getBook_list() {
        return book_list;
    }
}
