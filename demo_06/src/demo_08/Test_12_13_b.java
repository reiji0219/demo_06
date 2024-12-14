package demo_08;

import demo_06.Interface;

public class Test_12_13_b
{
	public static void main(String[] args) 
	{
		Calc13b calc = new Calc13b("Poly-morphism");
		calc.process( () -> {
			System.out.println( "関心事を記述");
			
			Interface save = Calc13b.create();
				save.execute();
		});	
	}
}