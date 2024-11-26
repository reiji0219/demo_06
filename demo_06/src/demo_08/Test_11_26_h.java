package demo_08;

import demo_06.Interface;

public class Test_11_26_h 
{	
	public static void main(String[] args) 
	{
		Calc26_2 calc = new Calc26_2("Poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc26_2.create();
			save.execute();
		});
	}
}
