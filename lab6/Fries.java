
public class Fries extends Composite{

	float price;
	String size;
	public Fries(String d) {
		super(d);
		size = d;
		if (d.equalsIgnoreCase("large"))
			price = 5.79f;
		if (d.equalsIgnoreCase("regular"))
			price = 4.19f;
		if (d.equalsIgnoreCase("little"))
			price = 2.79f;
	}
	
	public float getPrice () {
		return price;
	}
	
	public String printDescription() {
    	String op = "";
        op += "\nFries " + size + "\n";
        return op;
    }

}
