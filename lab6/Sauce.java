
public class Sauce implements Component{
	private String name;
	
	public Sauce(String n) {
		name = n;
	}
	@Override
	public void printDescription() {
		System.out.println("----> |" + name + "|<");
		// currentStratergy.print()
		
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
