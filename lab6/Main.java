
public class Main {
	
	public static void main(String args[]) {
		Composite burger = new Burger("Bacon Burger");
		Component lettuce = new Topping("Lettuce");
		Component tomato = new Topping("Tomatoes");
		Component GrilledOnions = new Topping("Grilled Oninos");
		Component GrilledJalapeno = new Topping("Grilled Jalapenos");
		Component BBQ = new Sauce("BBQ");
		burger.addItem(lettuce);
		burger.addItem(tomato);
		burger.addItem(GrilledOnions);
		burger.addItem(GrilledJalapeno);
		burger.addItem(BBQ);		
		burger.printDescription();
	}
}
