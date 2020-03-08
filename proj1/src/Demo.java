public class Demo {
    public static void main(String[] args) {
        /*
        String filename = "file.ser";
        Inventory inven = new Inventory(1);
        CareTaker careTaker = new CareTaker();

        inven.addBook("test1",34.9,11);
        inven.addBook("test2",25.0,20);
        careTaker.add(inven.saveBookListToMemento());

        inven.addBook("test3",54.1,23);
        inven.addBook("test4",66.0,60);
        careTaker.add(inven.saveBookListToMemento());

        careTaker.saveSerialize(filename);

         */
        /*
        InventoryInvoker invoker = new InventoryInvoker();
        invoker.add_book("test4",34.9,11);
        invoker.add_book("test5",74.5,50);
        invoker.add_book("test6",64.7,23);
        invoker.change_book_price("test4",45.6);
        invoker.save_inventory_to_file();
        invoker.add_book("test1",32.5,19);
        invoker.add_book("test2",120.3,5);
        */

        InventoryInvoker invoker = new InventoryInvoker();
        invoker.load_command_form_file();
        invoker.load_inventory_from_file();
        invoker.printcom();


    }
}
