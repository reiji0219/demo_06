package demo_08;

import demo_06.Interface;

public class Test_11_05_home {
	public static void main(String[] args) {
		Calc05 calc = new Calc05("Poly-morphism");
		calc.process(() -> {

			Interface save = Calc05.create();
			save.execute();

		});

	}
}