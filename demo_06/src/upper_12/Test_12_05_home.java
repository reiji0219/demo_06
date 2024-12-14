package upper_12;

import demo_06.Interface;

public class Test_12_05_home 
{
	public static void main(String[] args) 
	{
		Calc05h calc = new Calc05h("Poly-mprphism");
		calc.process(() -> {
			System.out.println( "関心事を記述" );

			Interface save = Calc05h.create();
			save.execute();
		});
	}
}