import java.util.ArrayList;

public class Composite implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    
    public Composite ( String d )
    {
        description = d ;
    }

    public void printDescription() {
        System.out.println( description );
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }

    public void addItem(Component c) {
        components.add( c ) ;
    }

    public void removeItem(Component c) {
        components.remove(c) ;
    }
}
