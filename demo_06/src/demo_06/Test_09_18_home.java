package demo_06;

public class Test_09_18_home 
{
	public static void main( String[] args  )
	{
		Calc18 calc = new Calc18( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );

			Interface save = Calc18.create();
				save.execute();
				
		});
		
	}
}
