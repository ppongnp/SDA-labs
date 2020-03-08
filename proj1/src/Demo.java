import java.util.*;

public class Demo {
    public static void main(String[] args) {
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

        boolean run = true;
        InventoryInvoker invoker = new InventoryInvoker();
        invoker.load_inventory_from_file();
        invoker.load_command_form_file();
        invoker.run_remaining_command();


        while(run){
            System.out.println("=== Welcome to Book Store Database ===!");
            System.out.println("  Press 1 to add new books");
            System.out.println("  Press 2 to to remove a book");
            System.out.println("  Press 3 to add more copies of books");
            System.out.println("  Press 4 to change the books price");
            System.out.println("  Press 5 to save the progress");
            System.out.println("  Press 6 to list all of the book");
            System.out.println("  Press 7 to list all of the previous command");
            System.out.println("  Press 8 to undo the previous command");
            System.out.println("  Press 9 to exit");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("=== Enter book name, quantity and price:");
                    Scanner myObj = new Scanner(System.in);
                    String name = myObj.nextLine();
                    int quantity = myObj.nextInt();
                    Double price = myObj.nextDouble();
                    invoker.add_book(name,price,quantity);
                    break;
                case 2:
                    System.out.println("=== Enter book name that you want to remove:");
                    Scanner book_scan = new Scanner(System.in);
                    String target_name = book_scan.nextLine();
                    invoker.remove_book(target_name);
                    break;
                case 3:
                    System.out.println("=== Enter the book name and quantity of copies that you want to add:");
                    Scanner copies_scan = new Scanner(System.in);
                    String target_add = copies_scan.nextLine();
                    int amount = copies_scan.nextInt();
                    invoker.add_book_copies(target_add,amount);
                    break;
                case 4:
                    System.out.println("=== Enter the book name and price that you want to change:");
                    Scanner price_scan = new Scanner(System.in);
                    String target = price_scan.nextLine();
                    Double newPrice = price_scan.nextDouble();
                    invoker.change_book_price(target,newPrice);
                    break;
                case 5:
                    System.out.println("=== Saving the progress! ");
                    invoker.save_inventory_to_file();
                    break;
                case 6:
                    System.out.println("=== listing all of the book ");
                    invoker.list_all_book();
                    break;
                case 7:
                    System.out.println("=== listing all of the previous command ");
                    invoker.list_all_command();
                    break;
                case 8:
                    System.out.println("=== undo the previous command");
                    invoker.undo_current_cmd();
                    break;
                case 9:
                    System.out.println("=== Exiting the Database !!");
                    run = false;
                    break;
                default:
                    System.out.println("=== Try the valid command!");
            }
        }

    }
}
