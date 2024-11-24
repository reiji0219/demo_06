package demo_08;

import demo_06.Interface;

public class Test_11_24_home
{
	public static void main(String[] args) 
	{
		Calc24j calc = new Calc24j("Poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc24j.create();
			save.execute();

		});
	}
}