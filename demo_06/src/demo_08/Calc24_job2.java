package demo_08;

import demo_06.Interface;

public class Calc24_job2 extends Item24_job2 
{
	private String name;

	public Calc24_job2(String name) {
		super();
		this.name = name;
	}

	public static Interface create() {
		return () -> {
			Calc24_job2 calc = new Calc24_job2("Poly-morphism");

			Item24_job2.save(item -> {
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

	public void process(Interface indter) {
		indi("start");

		indter.execute();

		indi("end");
	}
}