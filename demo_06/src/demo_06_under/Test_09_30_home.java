package demo_06_under;

import demo_06.Interface;

public class Test_09_30_home 
{
	public static void main( String[] args )
	{
		Calc30 calc = new Calc30( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );
			
			Interface save = Calc30.create();
				save.execute();
				
		});
	}
}