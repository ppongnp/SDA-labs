package lecture.utilbaby;
import java.util.Observable;

public class Baby extends Observable {


    private boolean crying=false;
    private int level=0;
    private String babyname;

    public Baby(String name){
        this.babyname=name;
    }

    public void setData(boolean crying, int level) {
        this.crying=crying;
        this.level=level;
        setChanged();
        notifyObservers(this.crying);
    }

    public boolean isCrying() {
        return crying;
    }

    public int getLevel() {
        return level;
    }

    public String getBabyname() {
        return babyname;
    }
}
