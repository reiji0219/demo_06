package demo_06_under;

import demo_06.Interface;

public class Test_09_24_home 
{
	public static void main( String[] args ) 
	{
		Calc24 calc = new Calc24( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );
			
			Interface save = Calc24.create();
				save.execute();
		});
		
		
		
	}
}