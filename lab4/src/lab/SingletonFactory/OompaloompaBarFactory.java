package lab.SingletonFactory;

public class OompaloompaBarFactory implements Factory {

    private int counter = 0;
    private static OompaloompaBarFactory uniqueInstance;

    private OompaloompaBarFactory(){
    }

    public synchronized  Bar create(int id){
        Bar bar = new OompaloompaBar(counter++);
        System.out.println(id+ " creates new Oompaloompa bar created with id:" + counter);
        return bar;
    }

    public static synchronized OompaloompaBarFactory getInstance(){
        if( uniqueInstance == null){
            uniqueInstance = new OompaloompaBarFactory();
        }
        return uniqueInstance;
    }
}
