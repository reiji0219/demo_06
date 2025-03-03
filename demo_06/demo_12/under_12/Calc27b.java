package under_12;

import demo_06.Interface;

public class Calc27b extends Item27b
{
  private String name;

  public Calc27b( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc27b calc = new Calc27b( "Poly-morphism" );

      Item27b.save( item -> {
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

