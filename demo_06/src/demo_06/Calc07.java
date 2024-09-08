package demo_06;

public class Calc07 extends Item07
{
	private String name;
	
	public Calc07( String name ) {
		super();
		this.name = name;
	}
	
	@Override
	public void display() {
		indi( name );
	}
	
	public void process( Interface inter ) {
		indi( "start" );
		
		inter.execute();
		
		indi( "end" );
	}
	
	
}
