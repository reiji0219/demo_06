package under_12;

import demo_06.Interface;

public class Calc26b extends Item26b
{
  private String name;

  public Calc26b( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
     Calc26b calc = new Calc26b( "Poly-morphism" );

     Item26b.save( item -> {
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

