package demo_06_under;

import demo_06.Interface;

public class Test_09_26_home 
{
	public static void main( String[] args )
	{
		Calc26 calc = new Calc26( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );
			
			Interface save = Calc26.create();
				save.execute();
				
		});
		
	}	
}