package demo_07;

import demo_06.Interface;

public class Test_10_31_home 
{
	public static void main(String[] args) 
	{
		Calc31 calc = new Calc31("Poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc31.create();
			save.execute();

		});

	}
}