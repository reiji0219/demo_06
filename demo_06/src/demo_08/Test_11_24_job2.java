package demo_08;

import demo_06.Interface;

public class Test_11_24_job2 
{
	public static void main(String[] args) 
	{
		Calc24_job2 calc = new Calc24_job2("Poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc24_job2.create();
			save.execute();

		});
	}
}