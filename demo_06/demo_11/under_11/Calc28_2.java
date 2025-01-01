package under_11;

import demo_06.Interface;

public class Calc28_2 extends Item28_2 
{
	private String name;

	public Calc28_2(String name) {
		super();
		this.name = name;
	}

	public static Interface create() {
		return () -> {
			Calc28_2 calc = new Calc28_2("Poly-morphism");

			Item28_2.save(item -> {
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