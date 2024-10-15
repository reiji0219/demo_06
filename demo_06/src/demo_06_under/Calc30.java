package demo_06_under;

import demo_06.Interface;

public class Calc30 extends Item30
{
	private String name;
	
	public Calc30( String name ) {
		super();
		this.name = name;
	}
	
	public static Interface create() {
		return() -> {
			Calc30 calc = new Calc30( "Poly-morphism" );

			Item30.save( item -> {
				item.id( "掛け算" )
					  .name( "税込み価格" )
					  .price( 980 )
					  .tax( 1.1 )
					  .calc( calc );
				
				System.out.println( "掛け算 :" + item.getId() );
				
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