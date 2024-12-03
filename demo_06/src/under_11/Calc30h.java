package under_11;

import demo_06.Interface;

public class Calc30h extends Item30h
{ 
  private String name;

  public Calc30h( String name ){ 
    this.name = name;
  }

  public static Interface create(){ 
    return() -> { 
      Calc30h calc = new Calc30h( "Poly-morphism" );

      Item30h.save( item -> { 
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
public void display(){ 
    indi( name );
  }

  public void process( Interface inter ){ 
    indi( "start" );

    inter.execute();

    indi( "end" );
  }
}