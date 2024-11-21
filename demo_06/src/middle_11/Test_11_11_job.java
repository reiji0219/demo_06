package middle_11;

import demo_06.Interface;

public class Test_11_11_job
{
	public static void main(String[] args) 
	{
		Calc11 calc = new Calc11("Poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc11.create();
			save.execute();

		});
	}
}