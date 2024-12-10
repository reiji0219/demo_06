package demo_08;

import demo_06.Interface;

public class Test_12_10_home 
{
	public static void main(String[] args) 
	{
		Calc10 calc = new Calc10("Poly-morphism");
		calc.process(() -> {

			Interface save = Calc10.create();
			save.execute();

		});
	}
}