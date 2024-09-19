package demo_06;

public class Test_09_17_home 
{
	public static void main( String[] args )
	{
		Calc17 calc = new Calc17( "Poly-morphism" );
		calc.process( () -> {

			Interface save = Calc17.create();
				save.execute();
			
		});
		
		
	}
}
