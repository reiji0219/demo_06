package demo_06_under;

import demo_06.Interface;

public class Calc23 extends Item23
{
	private String name;
	
	public Calc23( String name ){
		super();
		this.name = name;
	}

	public static Interface create(Calc23 calc) {
		return() -> {
			Item23.save( item -> {
				item.id( "掛け算" )
					  .name( "税込み価格" )
					  .price( 980 )
					  .tax( 1.1 )
					  .calc( calc );
				
				System.out.println( "計算式 :" + item.getId());
				
				item.display();
				
			});
			
		};
	}
	
	@Override
	public void display() {
		indi( name );
	}
	
	public void process( Interface inter ){
		indi( "start" );
		
		inter.execute();
		
		indi( "end" );
	}
	
}