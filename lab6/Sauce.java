
public class Sauce implements Component{
	private String name;
	
	public Sauce(String n) {
		name = n;
	}
	@Override
	public String printDescription() {
		return name;
		
	}

	@Override
	public void addItem(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeItem(Component c) {
		// TODO Auto-generated method stub
		
	}

}
