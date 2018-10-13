
public class Main {
	
	public static void main(String args[]) {
		Composite myOrder = new Order("My Order");
		Composite burger = new Burger("Bacon Burger");
		Component lettuce = new Topping("Lettuce");
		Component tomato = new Topping("Tomatoes");
		Component GrilledOnions = new Topping("Grilled Oninos");
		Component GrilledJalapeno = new Topping("Grilled Jalapenos");
		Component BBQ = new Sauce("BBQ");
		Component GreenPeppers = new Topping("Green Peppers");
		Component Relish = new Topping("Relish");
		Component Fries = new Fries("little");
		burger.addItem(lettuce);
		burger.addItem(tomato);
		burger.addItem(GrilledOnions);
		burger.addItem(GrilledJalapeno);
		burger.addItem(BBQ);
		burger.addItem(GreenPeppers);
		burger.addItem(Relish);
		myOrder.addItem(burger);
		myOrder.addItem(Fries);
		System.out.println("Customer Copy\n");
		PrintStrategy cr = new CustomerReceipt();
		cr.printReceipt(myOrder);
		System.out.println("\nPacking Copy\n");
		PrintStrategy pr = new PackingReceipt();
		pr.printReceipt(myOrder);
	}
}
