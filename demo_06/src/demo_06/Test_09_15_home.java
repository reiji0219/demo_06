package demo_06;

public class Test_09_15_home 
{
	public static void main( String[] args )
	{
		Calc15 calc = new Calc15( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );
	
			Interface save = Calc15.create();
				save.execute();
			
		});
	}
}
