public class Book {
    private int id;
    private String book_name;
    private Double price;
    private int quantity;

    public Book(int id,String name,Double price,int quantity){
        this.id = id;
        this.book_name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getBook_name() {
        return book_name;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(Double price){
        this.price = price;
    }
}
