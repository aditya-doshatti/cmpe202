
public class Order extends Composite{

	float price;
	public Order(String d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	
	public String printDescription() {
    	String op = "";
        for (Component obj  : components)
        {
            op += obj.printDescription() + "\n";
            op += "            " + obj.getPrice();
            price += obj.getPrice();
        }
        return op;
    }
	
	public float getSubTotal() {
		return price;
	}

}
