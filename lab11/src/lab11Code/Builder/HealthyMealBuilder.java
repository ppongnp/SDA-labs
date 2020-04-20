/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11Code.Builder;
/**
 *
 * @author boonjv
 */
public class HealthyMealBuilder extends MealBuilder {
    Meal meal;

    public HealthyMealBuilder(){
        this.meal = new Meal();
    }

    public void Entree(){
        this.meal.setEntree("A chicken sandwich");
    }

    public void Side(){
        this.meal.setSide("carrot sticks");
    }

    public void Drink(){
        this.meal.setDrink("diet cola");
    }

    public Meal getMeal() {
        return meal;
    }
}
