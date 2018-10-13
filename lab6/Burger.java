public class Burger extends Composite
{   
    public Burger ( String d )
    {
        super(d) ;
        if (d.contains("Bacon")) {
        	super.addItem(new Meat("Bacon"));
        }
    }
        
    public String printDescription() {
    	String op = "";
        for (Component obj  : components)
        {
            op += obj.printDescription() + "\n";
        }
        return op;
    }
}
