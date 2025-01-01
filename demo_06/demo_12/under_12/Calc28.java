package under_12;

import demo_06.Interface;

public class Calc28 extends Item28 {
	private String name;

	public Calc28( String name ) {
		super();
		this.name = name;
	}

	public static Interface create() {
		return () -> {
			Calc28 calc = new Calc28( "Poly-morphism" );

			Item28.save(item -> {
				item.id("掛け算")
					  .name("税込み価格")
					  .price(980)
					  .tax(1.1)
					  .calc(calc);

				System.out.println( "計算式 :" + item.getId() );

				item.display();

				item.execute();
			});
		};
	}

	@Override
	public void display() {
		indi( name );
	}

	public void process( Interface inter ) {
		indi( "start" );

		inter.execute();

		indi( "end" );
	}
}