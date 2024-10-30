package demo_07;

import demo_06.Interface;

public class Test_10_11_home 
{
	public static void main(String[] args) 
	{
		Calc11 calc = new Calc11("Poly-morphism");
		calc.process(() -> {
			System.out.println("Poly-mophism");

			Interface save = Calc11.create();
			save.execute();

		});
	}
}
