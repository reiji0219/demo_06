package demo_06;

public class Test_09_03_job 
{
	public static void main( String[] args )
	{
		Calc03 calc = new Calc03( "Poly-morphism" );
		calc.process( () -> {

			Interface save = Calc03.create();
				save.execute();
		});
		

	}
}