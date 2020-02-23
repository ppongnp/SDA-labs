package lab5Code.breakfast;

public abstract class EggsBreakfast {

    void cookingTheEggs(int num){
        crackEggs(num);
        prepare();
        cook();
        if ( needSaltAndPepper() ){
            addSaltAndPepper();
        }

    }

    private void crackEggs(int num) { System.out.println("Cracking " + num +  "eggs");};

    abstract void prepare();

    abstract void cook();

    void serving() { System.out.println("Placing the eggs on a plate");}

    void addSaltAndPepper() {System.out.println("Adding some salt and pepper");}

    boolean needSaltAndPepper() {return true;}
}
