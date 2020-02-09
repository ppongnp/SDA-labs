package lecture.utilbaby;
import java.util.Observable;
import java.util.Observer;

public class BabyMonitorAdvanced implements Observer {
    private Observable mdata, cdata;
    private String babyname;
    private String name;
    private boolean crying;
    private int level;

    public BabyMonitorAdvanced(String name, Baby m, Baby c) {
        this.name=name; this.mdata=m; this.cdata=c;
        mdata.addObserver(this);
        cdata.addObserver(this);
    }

    public void update(Observable observable, Object arg){
        Baby temp = (Baby) observable;
        this.babyname = temp.getBabyname();
        this.crying = temp.isCrying();
        this.level = temp.getLevel();
        display();
    }

    public void display() {
        if (crying) {
            System.out.println("Monitor:"+ name + " baby: " + babyname + " is crying at level: " + level);
        }
    }
}
