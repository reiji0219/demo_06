package under_11;

import demo_06.Interface;

public class Test_11_23_job 
{
	public static void main(String[] args) 
	{
		Calc23 calc = new Calc23("Poly-mprphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc23.create();
			save.execute();
		});
	}
}