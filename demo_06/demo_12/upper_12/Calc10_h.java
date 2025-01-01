package upper_12;

import demo_06.Interface;

public class Calc10_h extends Item10_h
{
  private String name;

  public Calc10_h( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc10_h calc = new Calc10_h( "Poly-morphism" );

      Item10_h.save( item -> {
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