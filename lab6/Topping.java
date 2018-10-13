import java.util.ArrayList;
import java.util.Arrays;

public class Topping implements Component{

	private boolean topBun;
	protected String name;
	
	ArrayList<String> topToppings = new ArrayList<String>(Arrays.asList("Mayo", "Lettuce", 
			"Pickels", "Tomatoes", "Oninos", "Relish"));
	
	public Topping(String n) {
		name = n;
		if (topToppings.contains(n)) {
			topBun = true;
		}
		else {
			topBun = false;
		}
	}
	
	boolean isTopTopping() {
		return topBun;
	}
	
	@Override
	public String printDescription() {
		return name;
		
	}

	@Override
	public void addItem(Component c) {
		// do nothing
		
	}

	@Override
	public void removeItem(Component c) {
		// do nothing
		
	}

}
