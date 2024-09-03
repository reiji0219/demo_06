package demo_06;

public class Test_09_03_home 
{
	public static void main( String[] args )
	{
		Calc03h calc = new Calc03h( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );

			Interface save = Calc03h.create();
				save.execute();
				
		});
		
	}
	
}
