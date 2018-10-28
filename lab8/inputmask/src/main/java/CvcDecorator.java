
public class CvcDecorator implements IDecorator {
	public String display(String number) {
		if ( number.equals("") )
			return "[123]" + "  " ;
		else
			return "[" + number + "]" + "  " ;
	}

}
