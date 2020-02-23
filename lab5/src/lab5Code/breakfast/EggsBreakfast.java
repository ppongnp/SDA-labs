package lab5Code.breakfast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class EggsBreakfast {

    void cookingTheEggs(int num){
        crackEggs(num);
        prepare();
        cook();
        if ( needSaltAndPepper() ){
            addSaltAndPepper();
        }
        serving();
    }

    private void crackEggs(int num) { System.out.println("    Cracking " + num +  " eggs");};

    abstract void prepare();

    abstract void cook();

    private void serving() { System.out.println("    Placing the eggs on a plate");}

    private void addSaltAndPepper() {System.out.println("    Adding some salt and pepper");}

    private boolean needSaltAndPepper() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String ans = null;
        System.out.print("    Would you like to add some salt and pepper to your eggs (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            ans = in.readLine();
        } catch (IOException ioe) {
            System.err.println("    IO error trying to read your answer");
        }
        if (ans == null) {
            return "no";
        }
        return ans;
    }
}
