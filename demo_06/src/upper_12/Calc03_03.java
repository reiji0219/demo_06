package upper_12;

import demo_06.Interface;

public class Calc03_03 extends Item03_03 {
	private String name;

	public Calc03_03(String name) {
		super();
		this.name = name;
	}

	public static Interface create() {
		return () -> {
			Calc03_03 calc = new Calc03_03("Poly-morphism");

			Item03_03.save(item -> {
				item.id("掛け算")
					  .name("税込み価格")
					  .price(980)
					  .tax(1.1)
					  .calc(calc);

				System.out.println("計算式 :" + item.getId());

				item.display();

				item.execute();
			});
		};
	}

	@Override
	public void display() {
		indi(name);
	}

	public void process(Interface inter) {
		indi("start");

		inter.execute();

		indi("end");
	}
}