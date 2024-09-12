package demo_06;

public class Test_09_12_job 
{
	public static void main( String[] args )
	{
		Calc12 calc = new Calc12( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );
			
			Interface save = Calc12.create();
				save.execute();
				
		});
	}
}
