

public class NotEnoughMoneyState implements State {
    GumballMachine gumballMachine;
 
    public NotEnoughMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin(int value) {
		System.out.println("You inserted a coin");
		System.out.println("Money collected is " + gumballMachine.moneyCollected);
		if (gumballMachine.moneyCollected >= gumballMachine.cost) {
			gumballMachine.setState(gumballMachine.getHasQuarterState());
		}
		else {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
		
	}
 
	public void ejectQuarter() {
		if (gumballMachine.moneyCollected > 0) {
			System.out.println("All money returned");
			gumballMachine.moneyCollected = 0;
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
		else {
			System.out.println("You haven't inserted a quarter");
		}
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no enough money");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for quarter";
	}
}
