import java.util.*;

public class Inventory {
    public int id;
    public ArrayList<Book> book_list;
    static int count = 0;

    public Inventory(int id){
        this.id = id;
        book_list = new ArrayList<Book>();
    }

    public void addBook(String name,Double price,int quantity){
        count += 1;
        Book newOne = new Book(count,name,price,quantity);
        book_list.add(newOne);
    }

    public void removeBook(String name){
        String result = "Remove failed";
        for(int i = 0; i < book_list.size();i++){
            if(book_list.get(i).getBook_name().equals(name)) {
                book_list.remove(i);
                result = "Remove success";
                break;
            }
        }
        System.out.println(result);
    }

    public void changeBookPrice(String name,Double price) {
        String result = "Change failed";
        for(int i = 0; i < book_list.size(); i++){
            if(book_list.get(i).getBook_name().equals(name)){
                book_list.get(i).setPrice(price);
                result = "Change success";
                break;
            }
        }
        System.out.println(result);
    }

    public Book searchByName(String name){
        Book temp = null;
        for(int i = 0; i < book_list.size(); i++){
            if(book_list.get(i).getBook_name().equals(name)){
                temp = book_list.get(i);
                System.out.println("huhu");
                break;
            }
        }
        return temp;
    }

    public Memento saveBookListToMemento(){
        return new Memento(book_list);
    }

    public void getBookListFromMemento(Memento memento){
        this.book_list = memento.getBook_list();
    }
}
