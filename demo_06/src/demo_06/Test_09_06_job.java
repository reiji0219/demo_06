package demo_06;

public class Test_09_06_job 
{
	public static void main( String[] args )
	{
		Calc06 calc = new Calc06( "Poly-morohism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );

			Interface save = Calc06.create();
				save.execute();
			
		});
	}
}