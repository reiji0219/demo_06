package demo_07;

import demo_06.Interface;

public class Test_10_02_home 
{
	public static void main( String[] args )
	{
		Calc02 calc = new Calc02( "Poly-morphims" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );
			
			Interface save = Calc02.create();
				save.execute();
				
				
		});
	}
}
