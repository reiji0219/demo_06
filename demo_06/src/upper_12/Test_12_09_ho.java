package upper_12;

import demo_06.Interface;

public class Test_12_09_ho 
{
	public static void main(String[] args) 
	{
		Calc09h calc = new Calc09h("Poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc09h.create();
			save.execute();

		});
	}
}