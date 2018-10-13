
public class PackingReceipt implements PrintStrategy {

	@Override
	public void printReceipt(Composite obj) {
		String output = "";
		String top = "";
		String bottom = "";
		for (Component obj2 : obj.components)
		{
			if (obj2.getClass().equals(Burger.class))
			{
				for (Component obj1  : ((Burger)obj2).components)
		        {
					if(obj1.getClass().equals(Topping.class))
						if (((Topping)obj1).isTopTopping())
							top += obj1.printDescription() + "\n";
						else
							bottom += "-> |" + obj1.printDescription() + "\n";
		        }
				output += top; 
				output += bottom;
				for (Component obj1  : ((Burger)obj2).components)
		        {
					if(obj1.getClass().equals(Sauce.class))
						output += "---> |" + obj1.printDescription() + "\n";
		        }
				for (Component obj1  : ((Burger)obj2).components)
		        {
					if(obj1.getClass().equals(Meat.class))
						output += "{{{{ " + obj1.printDescription() + " }}}} \n";
		        }
				
				System.out.println(output);
			}
			else {
				System.out.println(obj2.printDescription());
			}
		}
	}

}
