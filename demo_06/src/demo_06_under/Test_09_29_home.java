package demo_06_under;

import demo_06.Interface;

public class Test_09_29_home
{
	public static void main( String[] args ) 
	{
		Calc29 calc = new Calc29( "Poly-morphism" );
		calc.process( () -> {
			
			Interface save = Calc29.create();
				save.execute();
			
		});

	}
}