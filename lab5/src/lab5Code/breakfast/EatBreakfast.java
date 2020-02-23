package lab5Code.breakfast;
public class EatBreakfast {
	public static void main(String[] args) {

		System.out.println("============   Scrambled Eggs   ============");
		ScrambledEggs scrambled = new ScrambledEggs();
		scrambled.cookingTheEggs(3);
		System.out.println("============================================");

		System.out.println("============   Omelette   ============");
		Omelette omelette = new Omelette();
		omelette.cookingTheEggs(1);
		System.out.println("======================================");

		System.out.println("============   Sunny side eggs  ============");
		SunnySide sunny = new SunnySide();
		sunny.cookingTheEggs(2);
		System.out.println("============================================");
	}

}
