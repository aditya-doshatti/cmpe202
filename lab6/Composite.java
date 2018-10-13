import java.util.ArrayList;

public class Composite implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    
    public Composite ( String d )
    {
        description = d ;
    }

    public String printDescription() {
        System.out.println( description );
        String output = "";
        for (Component obj  : components)
        {
            output += "\n" + obj.printDescription();
        }
        return output;
    }

    public void addItem(Component c) {
        components.add( c ) ;
    }

    public void removeItem(Component c) {
        components.remove(c) ;
    }

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
