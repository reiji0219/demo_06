package middle_11;

import demo_06.Interface;

public class Test_11_13_job
{
	public static void main(String[] args) 
	{
		Calc13 calc = new Calc13("Poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc13.create();
			save.execute();

		});
	}
}
