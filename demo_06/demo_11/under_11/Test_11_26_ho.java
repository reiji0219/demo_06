package under_11;

import demo_06.Interface;

public class Test_11_26_ho 
{
	public static void main(String[] args) 
	{
		Calc26_3 calc = new Calc26_3("Poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc26.create();
			save.execute();
		});
	}
}