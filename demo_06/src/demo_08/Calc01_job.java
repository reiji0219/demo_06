package demo_08;

import demo_06.Interface;

public class Calc01_job extends Item01_job
{
  private String name;

  public Calc01_job( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc01_job calc = new Calc01_job( "Poly-morphism" );

      Item01_job.save( item -> {
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