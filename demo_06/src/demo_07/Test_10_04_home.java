package demo_07;

import demo_06.Interface;

public class Test_10_04_home 
{
	public static void main( String[] args )
	{
		Calc04 calc = new Calc04( "Poly-morphism" );
		calc.process( () -> {
			
			Interface save = Calc04.create();
				save.execute();
			
		});

	}
}
