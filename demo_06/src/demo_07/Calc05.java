package demo_07;

public class Calc05 extends Item05
{
	private String name;
	
	public Calc05( String name ) {
		super();
		this.name = name;
	}
	
	@Override
	public void display() {
		indi( name ); 
	}
	
}
