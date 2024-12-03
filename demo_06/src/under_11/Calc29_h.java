package under_11;

import demo_06.Interface;

public class Calc29_h extends Item29_h
{
  private String name;

  public Calc29_h( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc29_h calc = new Calc29_h( "Poly-morphism" );

      Item29_h.save(item -> {
        item.id("掛け算")
              .name("税込み価格")
              .price(980)
              .tax(1.1)
              .calc( calc );

        System.out.println("Hello World");

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

