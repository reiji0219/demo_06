package demo_08;

import demo_06.Interface;

public class Test_12_05_home 
{
	public static void main(String[] args) 
	{
		Calc05h calc = new Calc05h("Poly-mprphism");
		calc.process(() -> {

			Interface save = Calc05h.create();
			save.execute();
		});
	}
}