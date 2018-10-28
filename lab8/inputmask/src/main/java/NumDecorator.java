
public class NumDecorator implements IDecorator{
	
	public NumDecorator (){}

	@Override
	public String display(String number) {
		String retVal = "[";
		int i = 0;
		if ( number.equals("") )
			retVal +=  "4444 4444 4444 4444";
		else 
		{
			for (i = 0;i < number.length(); i++)
			{
				retVal += number.charAt(i);
				if((i+1)%4 == 0 && i != 15)
				{
					retVal += " ";
				}
			}
		}
		return retVal + "] ";
	}

}
