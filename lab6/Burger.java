public class Burger extends Composite
{   
	float price;
    public Burger ( String d )
    {
        super(d) ;
        price = 5.59f;
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
    
    public float getPrice() {
    	return price;
    }
}
