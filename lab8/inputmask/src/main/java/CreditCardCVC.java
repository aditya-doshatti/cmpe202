/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String cvc = "" ;
	private CvcDecorator cvcDec = new CvcDecorator();

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		return cvcDec.display(cvc);
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 21 || (cnt == 22 && ch.equalsIgnoreCase("x")) ) {
			if (ch.equalsIgnoreCase("x"))
			{
				if(cvc.length() > 0)
					cvc = cvc.substring(0, cvc.length() -1);
			}					
			else if ( cnt >= 21 && cnt <= 23 )
				cvc += ch ;
			else if ( nextHandler != null )
				nextHandler.key(ch, cnt) ;
		}
		
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}