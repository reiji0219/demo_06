package under_12;

import demo_06.Interface;

public class Test_12_29b
{
  public static void main( String[] args )
  {
    Calc29b calc = new Calc29b( "Poly-morphism" );
    calc.process( () -> {

    Interface save = Calc29b.create();
      save.execute();
    });
  }
}

