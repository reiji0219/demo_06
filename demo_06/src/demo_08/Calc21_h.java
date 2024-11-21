package demo_08;

import demo_06.Interface;

public class Calc21_h extends Item21_h
{
  private String name;

  public Calc21_h( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc21_h calc = new Calc21_h( "Poly-morphism" );

      Item21_h.save( item -> {
        item.id( "掛け算" )
            .name( "税込み価格" ) 
            .price( 980 )
            .tax( 1.1 )
            .calc( calc );

        System.out.println( "計算式 :" + item.getId());

        item.getId();

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