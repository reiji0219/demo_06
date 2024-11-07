package demo_07;

import demo_06.Interface;

public class Test_10_18_home 
{
	public static void main(String[] args) 
	{
		Calc13 calc = new Calc13("Poly-mophism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc13.create();
			save.execute();

		});

	}

}