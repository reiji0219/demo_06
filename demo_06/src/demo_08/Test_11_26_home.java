package demo_08;

import demo_06.Interface;
import under_11.Calc21_h;

public class Test_11_26_home 
{
	public static void main(String[] args) 
	{
		Calc26 calc = new Calc26("Poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc21_h.create();
			save.execute();

		});
	}
}