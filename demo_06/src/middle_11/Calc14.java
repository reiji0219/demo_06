package middle_11;

import demo_06.Interface;

public class Calc14 extends Item14 {
	private String name;

	public Calc14(String name) {
		super();
		this.name = name;
	}

	public static Interface create() {
		return () -> {
			Calc14 calc = new Calc14( "関心事を記述" );

			Item14.save(item -> {
				item.id("掛け算")
					  .name("税込み価格 ;")
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