package demo_08;

import demo_06.Interface;

public class Test_11_24_job 
{
	public static void main(String[] args)
	{
		Calc24_j calc = new Calc24_j("Poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc24_j.create();
				save.execute();
		});
	}
}
