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
/**
 * Meal models a typical fast-food chain value meal consisting of an
 * entree, a side, and a drink. 
 */
public class Meal {
  
  private String entree = ""; /** Primary dish of this meal */
  private String side = "";   /** Side dish of this meal */
  private String drink = "";  /** Drink for this meal */

  /**
   * Set the entree of this meal to the specified value.
   *
   * @param entree Specified value to set the entree of this meal to
   */
  public void setEntree(String entree) {
    this.entree = entree;
  }


  public void setSide(String side) { 
    this.side = side;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }


  public String toString() {
    return entree + " with a side of " + side + " and a " + drink;
  }
}