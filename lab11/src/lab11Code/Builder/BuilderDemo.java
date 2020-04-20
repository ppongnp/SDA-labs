
package lab11Code.Builder;

/**
 *
 * @author boonjv
 */
/** A driver class for building some value meals 
 *
 * @author Jerod Weinman
 */
public class BuilderDemo {

  
  /**
   * A program that creates a cook and uses it with various meal builders
   * to construct meals.
   *
   * @param args unused command-line arguments
   */
  public static void main(String[] args) {

    Cook cook = new Cook();
    Meal meal;

    BurgerMealBuilder burgerBuilder = new BurgerMealBuilder();
    HealthyMealBuilder healthyBuilder = new HealthyMealBuilder();

    cook.setMealBuilder (burgerBuilder);

    cook.constructMeal();
    meal = cook.getMeal();

    System.out.println("Order up! A " + meal);

    cook.setMealBuilder (healthyBuilder);

    cook.constructMeal();
    meal = cook.getMeal();

    System.out.println("Order up! A " + meal);

    cook.constructMeal();
    meal = cook.getMeal();

    System.out.println("Order up! A " + meal);

    cook.setMealBuilder (burgerBuilder);

    cook.constructMeal();
    meal = cook.getMeal();

    System.out.println("Order up! A " + meal);
  }
}