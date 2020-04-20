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
/** Concrete builder for a meal with a burger, fries, and a cola. */
public class BurgerMealBuilder extends MealBuilder {
    Meal meal;

    public BurgerMealBuilder(){
        this.meal = new Meal();
    }

    public void Entree(){
        this.meal.setEntree("a Burger");

    }

    public void Side(){
        this.meal.setSide("fries");
    }

    public void Drink(){
        this.meal.setDrink("cola");
    }

    public Meal getMeal() {
        return meal;
    }
}