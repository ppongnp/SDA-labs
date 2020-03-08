import java.util.ArrayList;

public class CommandLog implements java.io.Serializable {
    private ArrayList<InventoryCommand> command_list;

    public CommandLog(ArrayList<InventoryCommand> commands){
        this.command_list = commands;
    }
    public ArrayList<InventoryCommand> getCommandList(){
        return this.command_list;
    }
}
