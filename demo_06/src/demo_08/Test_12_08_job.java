package demo_08;

import demo_06.Interface;

public class Test_12_08_job 
{
	public static void main(String[] args) 
	{
		Calc08 calc = new Calc08("Poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc08.create();
			save.execute();
		});
	}
}