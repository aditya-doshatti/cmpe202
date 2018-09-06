import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5, 50, new ArrayList<Integer>(Arrays.asList(5, 10, 25))) ;

		gumballMachine.insertQuarter( 5 );
		gumballMachine.insertQuarter( 5 );
		gumballMachine.insertQuarter( 10 );
		gumballMachine.insertQuarter( 25 );
		gumballMachine.insertQuarter( 5 );
		gumballMachine.turnCrank();

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
	}
}
