
public class NotValidCoinState implements State {
	GumballMachine gumballMachine;
	
	public NotValidCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	@Override
	public void insertCoin(int value) {
		System.out.println("This coins is not valid for this machine");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("All money returned");
		gumballMachine.moneyCollected = 0;
		gumballMachine.setState(gumballMachine.getNoQuarterState());
		
	}

	@Override
	public void turnCrank() {
		System.out.println("Enter valid coins to get gumball");		
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay with valid coins");		
	}
	
	public String toString() {
		return "Invalid coin entered";
	}

}
