package demo_07;

import demo_06.Interface;

public class Test_10_29_home 
{
	public static void main(String[] aegs) 
	{
		Calc29 calc = new Calc29("poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc29.create();
			save.execute();

		});

	}
}