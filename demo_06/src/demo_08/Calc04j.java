package demo_08;

import demo_06.Interface;

public class Calc04j extends Item04j
{
  private String name;

  public Calc04j( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc04j calc = new Calc04j( "Poly-morphism" );

      Item04j.save( item -> {
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