package demo_08;

import demo_06.Interface;

public class Calc24j extends Item24j
{
	private String name;

	public Calc24j(String name) {
		super();
		this.name = name;
	}

	public static Interface create() {
		return () -> {
			Calc24j calc = new Calc24j("Poly-morphism");

			Item24j.save(item -> {
				item.id("掛け算")
					  .name("税込み価格")
					  .price(980)
					  .tax(1.1)
					  .calc(calc);

				System.out.println("計算式 :" + item.getId());

				item.display();

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
