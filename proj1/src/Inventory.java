import java.util.*;

public class Inventory implements java.io.Serializable{
    private ArrayList<Book> book_list;
    static int count = 0;

    public Inventory(){
        book_list = new ArrayList<Book>();
    }
    public void listAllBook(){
        for(Book b:book_list){
            System.out.println(b.toString());
        }
    }

    public ArrayList<Book> getBook_list(){
        return book_list;
    }

    public void addBook(String name,Double price,int quantity){
        count += 1;
        Book newOne = new Book(count,name,price,quantity);
        book_list.add(newOne);
        System.out.println("=== Successfully added new book!");
        System.out.println(" Your new book is " + newOne.toString() + "\n" );
    }

    public void removeBook(String name){
        String result = "=== Remove failed: cant find the target book";
        for(int i = 0; i < book_list.size();i++){
            if(book_list.get(i).getBook_name().equals(name)) {
                book_list.remove(i);
                result = "=== Targeted book have been remove!";
                break;
            }
        }
        System.out.println(result);
    }

    public void addBookCopiesByName(String name,int quantity){
        String result = "=== Add failed: no target book found";
        for(int i = 0; i < book_list.size();i++){
            if(book_list.get(i).getBook_name().equals(name)) {
                book_list.get(i).setQuantity(book_list.get(i).getQuantity() + quantity);
                result = "=== Added success: now the " + book_list.get(i).getBook_name() +" have " +
                        book_list.get(i).getQuantity() + " copies";
                break;
            }
        }
        System.out.println(result);
    }

    public void changeBookPrice(String name,Double price) {
        String result = "Change price failed: no target book found]n";
        for(int i = 0; i < book_list.size(); i++){
            if(book_list.get(i).getBook_name().equals(name)){
                book_list.get(i).setPrice(price);
                result = "Change success: now the " +book_list.get(i).getBook_name() + " price is " +
                        book_list.get(i).getPrice() + " baht";
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
                break;
            }
        }
        return temp;
    }

    public void getBookListFromMemento(Memento memento){
        this.book_list = memento.getBook_list();
    }
}
