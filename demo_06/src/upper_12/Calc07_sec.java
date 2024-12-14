package upper_12;

import demo_06.Interface;

public class Calc07_sec extends Item07_sec {
	private String name;

	public Calc07_sec(String name) {
		super();
		this.name = name;
	}

	public static Interface create() {
		return () -> {
			Calc07_sec calc = new Calc07_sec("Poly-morphism");

			Item07_sec.save(item -> {
				item.id("計算式")
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