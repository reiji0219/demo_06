package demo_07;

import demo_06.Interface;

public class Test_10_12_home 
{
	public static void main(String[] args) 
	{
		Calc12 calc = new Calc12("Poly-morphism");
		calc.process(() -> {

			Interface save = Calc12.create();
			save.execute();

		});

	}
}
