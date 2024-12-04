package demo_08;

import demo_06.Interface;

public class Test_12_04_job 
{
	public static void main(String[] args) 
	{
		Calc04h calc = new Calc04h("Poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc04h.create();
			save.execute();

		});
	}
}