
public class Meat implements Component {

	private String name;
	public Meat(String n) {
		name = n;
	}
	@Override
	public void printDescription() {
		System.out.println("{{{{ " + name + " }}}}");
		//currentStratergy.print()

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
