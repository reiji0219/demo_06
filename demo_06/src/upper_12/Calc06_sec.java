package upper_12;

import demo_06.Interface;

public class Calc06_sec extends Item06_sec 
{
	private String name;

	public Calc06_sec(String name) {
		super();
		this.name = name;
	}

	public static Interface create() {
		return () -> {
			Calc06_sec calc = new Calc06_sec("Ploy-morphism");

			Item06_sec.save(item -> {
				item.id("掛け算").name("税込み価格").price(980).tax(1.1).calc(calc);

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