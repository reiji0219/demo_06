package demo_08;

import demo_06.Interface;

public class Test_11_28_2 
{
	public static void main(String[] args) 
	{
		Calc28_2 calc = new Calc28_2("Poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc28_2.create();
				save.execute();
		});
	}
}