package demo_06_under;

import demo_06.Interface;

public class Test_09_20_job
{
	public static void main(String[] args) 
	{
		Calc20 calc = new Calc20( "関心事を記述" );
		calc.process( () -> {
			System.out.println( "Poly-morphism" );

			Interface save = Calc20.create();
			save.execute();

		});
	}
}
