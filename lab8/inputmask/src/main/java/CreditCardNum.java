/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;
	private NumDecorator numdec = new NumDecorator();

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		return numdec.display(number) ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 || (cnt == 17 && ch.equalsIgnoreCase("x")) )
		{
			if (ch.equalsIgnoreCase("x"))
			{
				if(number.length() > 0)
					number = number.substring(0, number.length() -1);
			}
			else
				number += ch ;
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}