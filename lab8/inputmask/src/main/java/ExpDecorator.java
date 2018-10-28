
public class ExpDecorator  implements IDecorator {
	public String display(String number) {
		String retVal = "[";
		int i = 0;
		if ( number.equals("") )
			retVal +=  "MM/YY";
		else 
		{
			for (i = 0;i < number.length(); i++)
			{
				retVal += number.charAt(i);
				if(i == 1)
				{
					retVal += "/";
				}
			}
		}
		return retVal + "] ";
	}
}
