public class Burger extends Composite
{   
    public Burger ( String d )
    {
        super(d) ;
        if (d.contains("Bacon")) {
        	super.addItem(new Meat("Bacon"));
        }
    }
        
    public void printDescription() {
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
}
