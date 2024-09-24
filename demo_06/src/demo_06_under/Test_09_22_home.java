package demo_06_under;

import demo_06.Interface;

public class Test_09_22_home 
{
	public static void main( String[] args )
	{
		Calc22 calc = new Calc22( "Poly-morphism" );
		calc.process( () -> {

			Interface save = Calc22.create();
				save.execute();
			
				
		});
		
	}

}
