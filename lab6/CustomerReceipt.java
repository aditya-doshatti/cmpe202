
public class CustomerReceipt implements PrintStrategy {

	@Override
	public void printReceipt(Composite obj) {
		String retVal = (obj.printDescription());
		retVal += "\nSub Total   " + (((Order)obj).getSubTotal());
		System.out.println(retVal);
	}

}
