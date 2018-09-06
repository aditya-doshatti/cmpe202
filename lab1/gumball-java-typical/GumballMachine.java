import java.util.ArrayList;

public class GumballMachine
{

    private int num_gumballs;
    private int gumball_cost;
    private boolean can_deliver;
    private int money_collected;
    private ArrayList<Integer> accepted_coins;

    public GumballMachine( int size, int gumball_cost, ArrayList<Integer> accepted_coins)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.gumball_cost = gumball_cost;
        this.can_deliver = false;
        this.accepted_coins = accepted_coins;
    }

    public void insertQuarter(int coin)
    {
    	if (this.accepted_coins.contains(coin)) {
    		this.money_collected +=  coin;
    		System.out.println("Money collected is : " + this.money_collected);
    	}
    	else {
    		System.out.println("Insert valid coin");
    	}
    }
    
    public void canDeliver() {
    	if (this.money_collected >=  this.gumball_cost) {
    		this.can_deliver = true;
    	}
    	else {
    		this.can_deliver = false;
    	}
    }
    
    public void turnCrank()
    {
    	System.out.println("Total Money collected till now: " + this.money_collected);
    	this.canDeliver();
    	if ( this.can_deliver )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.can_deliver = false ;
    			this.money_collected -= this.gumball_cost;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}        
    }
}
