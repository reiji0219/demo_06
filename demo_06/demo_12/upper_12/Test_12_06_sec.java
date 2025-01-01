package upper_12;

import demo_06.Interface;

public class Test_12_06_sec
{
	public static void main(String[] args) 
	{
		Calc06_sec calc = new Calc06_sec("Ploy-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc06.create();
			save.execute();
		});
	}
}