
public class Main {
	
	public static void main(String args[]) {
		Composite burger = new Burger("Bacon Burger");
		Component lettuce = new Topping("Lettuce");
		Component tomato = new Topping("Tomatoes");
		Component GrilledOnions = new Topping("Grilled Oninos");
		Component GrilledJalapeno = new Topping("Grilled Jalapenos");
		Component BBQ = new Sauce("BBQ");
		Component GreenPeppers = new Topping("Green Peppers");
		Component Relish = new Topping("Relish");
		burger.addItem(lettuce);
		burger.addItem(tomato);
		burger.addItem(GrilledOnions);
		burger.addItem(GrilledJalapeno);
		burger.addItem(BBQ);
		burger.addItem(GreenPeppers);
		burger.addItem(Relish);
		System.out.println("Customer Copy\n");
		PrintStrategy cr = new CustomerReceipt();
		cr.printReceipt(burger);
		System.out.println("Packing Copy\n");
		PrintStrategy pr = new PackingReceipt();
		pr.printReceipt(burger);
	}
}
