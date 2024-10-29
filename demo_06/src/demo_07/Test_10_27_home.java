package demo_07;

import demo_06.Interface;

public class Test_10_27_home 
{
	public static void main(String[] args) 
	{
		Calc27 calc = new Calc27("Poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc27.create();
			save.execute();

		});
	}
}