
public class Meat implements Component {

	private String name;
	public Meat(String n) {
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
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
