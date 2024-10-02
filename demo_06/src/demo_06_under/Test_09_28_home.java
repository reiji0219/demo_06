package demo_06_under;

import demo_06.Interface;

public class Test_09_28_home 
{
	public static void main( String[] args )
	{
		Calc28 calc = new Calc28( "Poly-morphism" );
		calc.process( () -> {

			Interface save = Calc28.create();
				save.execute();
			
		});
				
	}
}