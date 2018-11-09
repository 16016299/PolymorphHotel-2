package Abstraction2;
	public abstract class Customer extends ClassWithAKeyboard
	{
	    protected String customerName;
	    protected String customerEmail;

	    abstract public void display();
	    abstract public String getName();
	    abstract public String getEmail();
	    abstract public String getAddress();
	    abstract public void calcCost(double cost);
	}
