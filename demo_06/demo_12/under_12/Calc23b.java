package under_12;

import demo_06.Interface;

public class Calc23b extends Item23b
{ 
  private String name;

  public Calc23b( String name ){ 
    super();
    this.name = name;
  }
  
  public static Interface create() {
	  return() -> {
		  Calc23b calc = new Calc23b( "Poly-morphism" );

		  Item23b.save( item -> { 
			  item.id( "掛け算" )
			        .name( "税込み価格" )
		            .price( 980 )
		            .tax( 1.1 )
		            .calc( calc );

			  System.out.println( "計算式 :" + item.getId());

			  item.display();
			  
			  item.execute();
		   });  
	  };
  }

  @Override
  public void display(){ 
    indi( name );
  }

  public void process( Interface inter ){ 
    indi( "start" );

    inter.execute();

    indi( "end" );
  }
}

