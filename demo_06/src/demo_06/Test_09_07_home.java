package demo_06;

public class Test_09_07_home 
{
	public static void main( String[] args )
	{
		Calc07 calc = new Calc07( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );
			
			Interface save = Calc07.create();
				save.execute();
				
		});
		
	}
}